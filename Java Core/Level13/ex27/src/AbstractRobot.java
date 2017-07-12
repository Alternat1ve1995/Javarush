
public abstract class AbstractRobot implements Attackable, Defensable{

	private int         defCount = 3;
	private int         hitCount = 3;

	public BodyPart attack() {
		BodyPart attackedBodyPart = null;
		hitCount = hitCount + 1;

		if (hitCount == 1) {
			attackedBodyPart = BodyPart.ARM;
		} else if (hitCount == 2) {
			attackedBodyPart = BodyPart.HEAD;
		} else if (hitCount == 3) {
			hitCount = 0;
			attackedBodyPart = BodyPart.LEG;
		} else {
			hitCount = 0;
			attackedBodyPart = BodyPart.CHEST;
		}
		return attackedBodyPart;
	}

	public BodyPart defense() {
		BodyPart defencedBodyPart = null;
		hitCount = defCount + 1;

		if (hitCount == 1) {
			defencedBodyPart = BodyPart.HEAD;
		} else if (hitCount == 2) {
			defencedBodyPart = BodyPart.LEG;
		} else if (hitCount == 3) {
			hitCount = 0;
			defencedBodyPart = BodyPart.ARM;
		} else {
			hitCount = 0;
			defencedBodyPart = BodyPart.CHEST;
		}
		return defencedBodyPart;
	}
}
