package collectionList;
import java.util.Comparator;

public class SortAccordingToModel implements Comparator<Car>
{

	@Override
	public int compare(Car c1,Car c2)
	{
		return c1.getModel() - c2.getModel();
	}
}
