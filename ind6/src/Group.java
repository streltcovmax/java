import java.util.ArrayList;

public class Group
{
    ArrayList<Student> a;

    public Group()
    {
        a = new ArrayList<Student>();
    }
    void add(Student s)
    {
        a.add(s);
    }
    void del(String fio)
    {
        int p =-1;
        for(int i=0;i<a.size();i++)
            if  (fio.equalsIgnoreCase(a.get(i).getFio())) p=i;
        if (p>-1){
            a.remove(p);
        }
    }

    void sort()
    {
        Student t;
        for(int i = 0; i < a.size(); i++)
            for(int j = 1; j < a.size(); j++)
            {
                int c = a.get(i).getFio().compareTo(a.get(j).getFio());
                if(c>0)
                {
                    t = a.get(i);
                    a.set(i, a.get(j));
                    a.set(j, t);
                }
            }
    }

    @Override
    public String toString()
    {
        String s = "";
        for(int i = 0; i < a.size(); i++)
            s+=a.get(i).toString() + '\n';
        return  s;
    }
}