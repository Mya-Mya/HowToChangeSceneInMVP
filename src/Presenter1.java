public class Presenter1 {
    private IView1 view;
    private Model model;

    public Presenter1(Model model) {
        this.model = model;
    }

    public void setView(IView1 view) {//POINT1. ビューを登録するメソッドを用意
        this.view = view;
    }

    public void onPush() {
        //POINT2. 次のシーンのプレゼンターを生成
        Presenter2 presenter2 = new Presenter2(model);
        //POINT3. シーンチェンジを指示
        view.requestChangeSceneTo2(presenter2);
    }
}
