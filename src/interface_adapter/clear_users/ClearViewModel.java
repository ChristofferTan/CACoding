package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.ViewModel;

import javax.swing.text.View;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class ClearViewModel extends ViewModel {
    public final String TITLE_LABEL = "Clear View";
    public final String OK_BUTTON_LABEL = "OK";

    private ClearState state = new ClearState();

    public ClearViewModel() {super("clear");}
    private final PropertyChangeSupport support = new PropertyChangeSupport(this);
    public ClearState getState() {return state;}

    @Override
    public void firePropertyChanged() {
        support.firePropertyChange("state", null, this.state);
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public void setState(ClearState clearState) {this.state = clearState;}
}
