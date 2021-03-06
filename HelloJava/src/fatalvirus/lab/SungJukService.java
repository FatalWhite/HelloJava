package fatalvirus.lab;

public class SungJukService {
	private int tot = 0;
	private double avg = 0.0;
	private String grd = "가";

	// getTotal
	public int getTotal(int kor, int eng, int mat) {
		// return (kor + eng + mat);
		tot = kor + eng + mat;
		return tot;
	}

	// 객체지향 특성 중 다형성
	public int getTotal(SungJukVO sj) {

		// 또 다른 유형의 getTotal
		// public void getTotal() {
		tot = sj.getKor() + sj.getEng() + sj.getMat();
		return tot;
	}

	// getAverage
	// public double getAverage(int kor, int eng, int mat) {
	public double getAverage() {
		// return (kor + eng + mat) / 3;
		avg = ((double) tot / 3.0);
		return avg;
	}

	// getGrade
	public String getGrade() {
		// if (avg>= 90) grd = "수";
		// else if (avg >= 80) grd = "우";
		// else if (avg >= 70) grd = "미";
		// else if (avg >= 60) grd = "양";

		switch ((int) avg / 10) {
		case 10:
		case 9:
			grd = "수";
			break;
		case 8:
			grd = "우";
			break;
		case 7:
			grd = "미";
			break;
		case 6:
			grd = "양";
			break;
		}
		return grd;

	}
}
