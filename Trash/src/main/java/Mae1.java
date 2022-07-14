import java.util.Arrays;
import java.util.List;

public class Mae1 {

    public static void main(String[] args) {
		List<SelectItem> optL = Arrays.asList(
				new SelectItem("group1","TESTE","group1",true),
				new SelectItem("1","opt1A","opt1B",false),
				new SelectItem("2","opt2A","opt2B",false),
				new SelectItem("3","opt3A","opt3B",false),
				new SelectItem("d","","",true),
				new SelectItem("group2","group2","group2",true),
				new SelectItem("21","opt21A","opt21B",false),
				new SelectItem("22","opt22A","opt22B",false),
				new SelectItem("23","opt23A","opt23B",false),
				new SelectItem("221","opt221A","opt221B",false)
		);
    }
}
