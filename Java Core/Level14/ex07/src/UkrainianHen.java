public class UkrainianHen extends Hen implements Country {

	@Override
	public int getCountOfEggsPerMonth() {
		return (4242);
	}

	@Override
	public String getDescription() {
		return (super.getDescription() + " Моя страна - " + UKRAINE + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.");
	}
}
