package fr.adaussy.permadeler.rcp.internal.spreadsheet;

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

import javax.annotation.Generated;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

import fr.adaussy.permadeler.rcp.RcpMessages;

public class SpreadsheetWriter<U> {

	private final Supplier<List<U>> candidatesProdvider;

	private final Path targetFolder;

	private final Supplier<String> nameProvider;

	private final Supplier<Shell> shellSupplier;

	private final List<ColumnExtractor<U>> extractors;

	private SpreadsheetWriter(Builder<U> builder) {
		this.candidatesProdvider = builder.candidatesProdvider;
		this.targetFolder = builder.targetFolder;
		this.nameProvider = builder.nameProvider;
		this.shellSupplier = builder.shellSupplier;
		this.extractors = builder.extractors;
	}

	public Optional<Path> writte(boolean openGeneratedFile) throws FileNotFoundException, IOException {

		List<U> candidates = candidatesProdvider.get();
		if (!candidates.isEmpty()) {
			String fileName = sanitizeFilename(nameProvider.get()) + ".xlsx"; //$NON-NLS-1$

			if (!targetFolder.toFile().exists()) {
				targetFolder.toFile().mkdirs();
			}

			Path targetFilePath = targetFolder.resolve(fileName);
			File targetFile = targetFilePath.toFile();
			if (targetFile.exists()) {
				if (!MessageDialog.openConfirm(shellSupplier.get(),
						RcpMessages.GenerateProductionSpreadsheetMenu_2,
						RcpMessages.GenerateProductionSpreadsheetMenu_3)) {
					return Optional.empty();
				} else {
					try {
						targetFile.delete();
					} catch (SecurityException e) {
						MessageDialog.openError(shellSupplier.get(),
								RcpMessages.GenerateProductionSpreadsheetMenu_4,
								RcpMessages.GenerateProductionSpreadsheetMenu_5);
						return Optional.empty();
					}
				}
			}

			new SpreadsheetBuilder<>(extractors)//
					.generate(targetFile.toPath(), candidates);

			if (openGeneratedFile) {
				Desktop.getDesktop().open(targetFile);
			}

			return Optional.of(targetFilePath);
		}

		return Optional.empty();

	}

	private String sanitizeFilename(String filename) {
		return filename.replaceAll("[^a-zA-Z0-9.-]", "-"); //$NON-NLS-1$ //$NON-NLS-2$
	}

	@Generated("SparkTools")
	public static <U> Builder<U> builder() {
		return new Builder<U>();
	}

	public static final class Builder<U> {
		private Supplier<List<U>> candidatesProdvider;

		private Path targetFolder;

		private Supplier<String> nameProvider;

		private Supplier<Shell> shellSupplier;

		private List<ColumnExtractor<U>> extractors = Collections.emptyList();

		private Builder() {
		}

		public Builder<U> withCandidatesProdvider(Supplier<List<U>> candidatesProdvider) {
			this.candidatesProdvider = candidatesProdvider;
			return this;
		}

		public Builder<U> withTargetFolder(Path targetFolder) {
			this.targetFolder = targetFolder;
			return this;
		}

		public Builder<U> withNameProvider(Supplier<String> nameProvider) {
			this.nameProvider = nameProvider;
			return this;
		}

		public Builder<U> withShellSupplier(Supplier<Shell> shellSupplier) {
			this.shellSupplier = shellSupplier;
			return this;
		}

		public Builder<U> withExtractors(List<ColumnExtractor<U>> extractors) {
			this.extractors = extractors;
			return this;
		}

		public SpreadsheetWriter<U> build() {
			return new SpreadsheetWriter<U>(this);
		}
	}

}
