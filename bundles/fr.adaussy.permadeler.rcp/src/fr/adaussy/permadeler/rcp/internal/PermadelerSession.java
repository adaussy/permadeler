package fr.adaussy.permadeler.rcp.internal;

import java.util.function.Consumer;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.sirius.business.api.session.Session;

import fr.adaussy.permadeler.model.Permadeler.KnowledgeBase;
import fr.adaussy.permadeler.model.Permadeler.Root;
import fr.adaussy.permadeler.model.Permadeler.SeedBank;

/**
 * A wrapper of {@link Session} that help accesing and modify the model
 * 
 * @author Arthur Daussy
 */
public class PermadelerSession {

	private final Session wrappedSession;

	private final Root root;

	public PermadelerSession(Session wrappedSession, Root root) {
		super();
		this.wrappedSession = wrappedSession;
		this.root = root;
	}

	/**
	 * Modifies the model by creating a transaction and passing the {@link KnowledgeBase}
	 * 
	 * @param name
	 *            the name of the action
	 * @param updater
	 *            the runnable that will modify the model
	 */
	public void modifyKnowledgeBase(String name, Consumer<KnowledgeBase> updater) {
		wrappedSession.getTransactionalEditingDomain().getCommandStack()
				.execute(new RecordingCommand(wrappedSession.getTransactionalEditingDomain(), name) {

					@Override
					protected void doExecute() {
						updater.accept(getKnowledgeBase());
					}
				});
	}

	/**
	 * Modifies the model by creating a transaction and passing the {@link SeedBank}
	 * 
	 * @param name
	 *            the name of the action
	 * @param updater
	 *            the runnable that will modify the model
	 */
	public void modifySeedBank(String name, Consumer<SeedBank> updater) {
		wrappedSession.getTransactionalEditingDomain().getCommandStack()
				.execute(new RecordingCommand(wrappedSession.getTransactionalEditingDomain(), name) {

					@Override
					protected void doExecute() {
						updater.accept(getSeedBank());
					}
				});
	}

	public KnowledgeBase getKnowledgeBase() {
		return root.getKnowledgeBase();
	}

	public Session getSession() {
		return wrappedSession;
	}

	public SeedBank getSeedBank() {
		return root.getSeedbank();
	}

}
