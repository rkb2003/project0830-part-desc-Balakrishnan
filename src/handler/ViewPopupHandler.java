 
package handler;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.EPartService;

import viewer.SimpleView;

public class ViewPopupHandler {
	@Inject
	private EPartService epartService;

	@Execute
	public void execute() {
		System.out.println("Debug in ViewPopupHandler");
		MPart findPart = epartService.findPart(SimpleView.VIEW_ID);
		Object findPartObj = findPart.getObject();

		if (findPartObj instanceof SimpleView) {
			SimpleView simpView = (SimpleView) findPartObj;
			simpView.appendText("Hello World!");
		}
	}
		
}