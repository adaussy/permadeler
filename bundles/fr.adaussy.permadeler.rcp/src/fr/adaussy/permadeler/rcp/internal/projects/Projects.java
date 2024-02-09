/*******************************************************************************
 * Copyright (c) 2024 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 * Obeo - Method refreshRepresentations 
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.internal.projects;

import static java.util.stream.Collectors.toList;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import fr.adaussy.permadeler.rcp.RcpPlugin;

public class Projects {

	private List<Project> projects = new ArrayList<Project>();

	public Projects(List<Project> projects) {
		super();
		this.projects = projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public static List<Project> loadProjects() {
		Path projectsPath = getFilePaths();
		if (Files.exists(projectsPath)) {
			Gson gson = new Gson();
			try (var reader = new FileReader(projectsPath.toFile(), Charset.forName("UTF-8"))) {
				Projects projectsBean = gson.fromJson(reader, Projects.class);
				return projectsBean.getProjects();
			} catch (JsonSyntaxException | JsonIOException | IOException e) {
				RcpPlugin.logError("Unable to load projects file"); //$NON-NLS-1$
			}
		}
		return List.of();
	}

	private static Path getFilePaths() {
		String userHome = System.getProperty("user.home"); //$NON-NLS-1$
		if (userHome != null) {
			return Path.of(userHome).resolve("permadeler/projects.json"); //$NON-NLS-1$
		}
		return null;
	}

	public static void addProject(String sessionURI, String projectName) {
		List<Project> listOfProject = new ArrayList<>(loadProjects());

		// remove this session if already exist
		listOfProject = listOfProject.stream()
				.filter(p -> p != null && !p.getUri().equals(sessionURI.toString())).collect(toList());
		listOfProject.add(0, new Project(sessionURI, projectName));
		listOfProject = listOfProject.subList(0, Math.min(listOfProject.size(), 10));

		Path path = getFilePaths();
		if (path != null) {
			if (!Files.exists(path)) {
				path.getParent().toFile().mkdirs();
			}

			Gson gson = new Gson();
			try (var writter = new FileWriter(path.toFile(), Charset.forName("UTF-8"))) {
				gson.toJson(new Projects(listOfProject), writter);
			} catch (JsonIOException | IOException e) {
				RcpPlugin.logError("Unable to save projects file"); //$NON-NLS-1$
			}

		}

	}
}
