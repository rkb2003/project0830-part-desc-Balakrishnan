 
package viewer;

import javax.inject.Inject;
import javax.annotation.PostConstruct;

import org.eclipse.e4.ui.services.EMenuService;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;

public class ViewPartDescriptor {
	
	public static final String VIEW_ID = "project0830-part-desc-balakrishnan.partdescriptor.viewpartdescriptor";

	//public static final String VIEW_ID2 = "project0830-part-desc-balakrishnan.partdescriptor.simpleviewpluginprojectaug30";

	
	public final static String POPUPMENU_ID = "project0830-part-desc-balakrishnan.popupmenu.mypopupmenu";
	
	public final static String POPUPMENU_ID2 = "project0830-part-desc-balakrishnan.popupmenu.mypopupmenu";

	private StyledText styledText = null;

	@Inject
	public ViewPartDescriptor() {
		
	}
	
	@PostConstruct
	public void postConstruct(Composite parent, EMenuService menuService) {
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new FillLayout(SWT.HORIZONTAL));
		styledText = new StyledText(container, SWT.BORDER);
		menuService.registerContextMenu(styledText, POPUPMENU_ID);
		menuService.registerContextMenu(styledText, POPUPMENU_ID2);
	}
	
	
		
	public void setText(String str) {
		this.styledText.setText(str);
	}

	public void appendText(String str) {
		this.styledText.append(str);
	}
	
	
	
	
}