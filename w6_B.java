import sortapp.subsortapp.SortImpl;
import Searchingimpl.SearchImpl;

public class ExecutePackage{
public static void main(String[] args){

SortImpl sortImpl=new SortImpl();
sortImpl.sort();


SearchImpl searchimpl =new SearchImpl();
searchimpl.search();
}

}
