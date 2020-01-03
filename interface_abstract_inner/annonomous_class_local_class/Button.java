package interface_abstract_inner.annonomous_class_local_class;

public class Button {
    private String name;
    private OnClickListener onClickListener;

    public Button(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setOnClickListener(OnClickListener onClickListener){
        this.onClickListener = onClickListener;
    }

    public void onClick(){
        this.onClickListener.onClick(name);

    }

    public interface OnClickListener{
         void onClick(String title);
    }
}
