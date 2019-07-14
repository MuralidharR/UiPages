
import Pages.VaadinRequest;
public class MyUI extends UI {
	  protected void init(VaadinRequest request) {
	    final TextField name = new TextField("Name");
	    final Button greetButton = new Button("Greet");
	    greetButton.addClickListener(
	      e -> Notification.show("Hi " + name.getValue())
	    );
	    setContent(new VerticalLayout(name, greetButton));
	  }
	}