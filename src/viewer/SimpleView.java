 
package viewer;

import javax.inject.Inject;
import javax.annotation.PostConstruct;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.e4.ui.services.EMenuService;

public class SimpleView {
	
	public static final String VIEW_ID = "project0830-part-desc-balakrishnan.partdescriptor.simpleviewpluginprojectaug30";

	public final static String POPUPMENU_ID = "plugin-project-aug30.popupmenu.mypopupmenu";

	private StyledText styledText = null;

	@Inject
	public SimpleView() {
		
	}
	
	@PostConstruct
	public void postConstruct(Composite parent, EMenuService menuServiceparent) {
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new FillLayout(SWT.HORIZONTAL));
		styledText = new StyledText(container, SWT.BORDER);
		menuServiceparent.registerContextMenu(styledText, POPUPMENU_ID);
	}
	
	public void setText(String str) {
		this.styledText.setText(str);
	}

	public void appendText(String str) {
		this.styledText.append(str);
	}
	
	
}