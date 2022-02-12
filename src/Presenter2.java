public class Presenter2 {
    private IView2 view;
    private Model model;

    public Presenter2(Model model) {
        this.model = model;
    }

    public void setView(IView2 view) {
        this.view = view;
    }

    public void onPush() {
        view.showSomething();
    }
}
