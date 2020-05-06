package jianzaozhemoshi;

public class Driector {
	public Human createhumanBydriector(Builder builder) {
		builder.buildhead();
		builder.buildbody();
		builder.buildhand();
		builder.buildfoot();
		return builder.createman();
	}
}
