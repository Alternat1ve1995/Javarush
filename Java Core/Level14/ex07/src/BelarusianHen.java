public class BelarusianHen extends Hen implements Country {

	@Override
	public int getCountOfEggsPerMonth() {
		return (100500);
	}

	@Override
	public String getDescription() {
		return (super.getDescription() + " Моя страна - " + BELARUS + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.");
	}
}
