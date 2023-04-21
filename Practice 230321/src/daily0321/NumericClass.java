package daily0321;
import java.math.BigDecimal;
public class NumericClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "-31.5123121231231212312315342137";
		System.out.println(text);
		System.out.println(Float.parseFloat(text));	//float로 parse 끄집어내다
		System.out.println(Double.parseDouble(text));//double로 parse
		
		Double d = Double.parseDouble(text);
		System.out.println(d);
		System.out.println(d.intValue());			//정수변환
		
		BigDecimal bd = new BigDecimal(text);
		System.out.println(bd);
		System.out.println(Math.round(d));			//반올림(소수점 표시X)
		System.out.println(Math.floor(d));			//내림
		System.out.println(Math.ceil(d));			//올림
		
		float f = 3.26f;
		System.out.println(f);
		System.out.println((int)f);					//정수변환
	}
}
//abs 절대값