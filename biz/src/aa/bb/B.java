package tk.deep;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by dozray on 2015/6/29.
 */
public class main {

    public static void main(String[] args){

        // 多列排序；按属性Code，Name 组合排序

        tk.deep.CompositeComparator myComparator = new tk.deep.CompositeComparator();

        myComparator.addComparators(

                new Comparator[] {

                        new Comparator<CompDto>(){

                            @Override
                            public int compare(CompDto o1, CompDto o2) {
                                String code1 = o1.getCode();
                                String code2 = o2.getCode();
                                return code1.compareTo(code2);
                            }

                        },

                        new Comparator<CompDto>() {

                            @Override
                            public int compare(CompDto o1, CompDto o2) {
                                String name1 = o1.getName();
                                String name2 = o2.getName();
                                return name1.compareTo(name2);
                            }
                        }
                }
        );



        List<CompDto> lst = new ArrayList<CompDto>();
        lst.add(new CompDto(1,"001","ccc"));
        lst.add(new CompDto(1,"001","bbbb"));
        lst.add(new CompDto(1,"000","aaaa"));
        lst.add(new CompDto(1,"000","dddd"));
        lst.add(new CompDto(1,"000","cccc"));
        java.util.Collections.sort(lst, myComparator);
        for(CompDto cd :lst)
            System.out.println(cd);

    }
}
