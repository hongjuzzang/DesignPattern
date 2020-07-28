package example1;

public class Button {

	public void onClick() {
		// 이벤트 처리
		if (onclickListener != null)
			onclickListener.onClick(this);
	}

	// 보통 내부에서 선언 : observer
	public interface OnClickListener {
		public void onClick(Button button);
	}

	private OnClickListener onclickListener;

	public void setOnClickListner(OnClickListener clickListner) {
		this.onclickListener = clickListner;
	}
}
