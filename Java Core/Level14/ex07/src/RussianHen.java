public class RussianHen extends Hen implements Country {

	@Override
	public int getCountOfEggsPerMonth() {
		return (143);
	}

	@Override
	public String getDescription() {
		return (super.getDescription() + " Моя страна - " + RUSSIA + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.");
	}
}
