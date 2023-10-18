package interface_adapter.clear_users;

// TODO Complete me

public class ClearState {
    private String[] usernamesDeleted;

    public ClearState(ClearState copy) {
        usernamesDeleted = copy.usernamesDeleted;
    }
    public ClearState() {
    }
    public String[] getUsernamesDeleted() {return usernamesDeleted;}
    public void setUsernamesDeleted(String[] usernamesDeleted) {this.usernamesDeleted = usernamesDeleted;}
}
