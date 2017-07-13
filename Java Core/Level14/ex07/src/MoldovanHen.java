public class MoldovanHen extends Hen implements Country {

	@Override
	public int getCountOfEggsPerMonth() {
		return (6);
	}

	@Override
	public String getDescription() {
		return (super.getDescription() + " Моя страна - " + MOLDOVA + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.");
	}
}
