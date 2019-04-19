

    class date{

        private int d;
        private int m;
        private int y;

        date(int d, int m, int y){
            this.d=d;
            this.m=m;
            this.y=y;
        }

        public String toString(){
            return String.format("%d/%d/%d", d,m,y);
        }

    }

    class student{

        private String name;
        private date dd;

        student(String name, date dd){
            this.name=name;
            this.dd=dd;
        }

        public String toString(){
            return String.format("%s was born on %s", name,dd);
        }
    }


class mymainclass1{
    public static void main(String[] args) {
    
        date dateobj = new date(30, 6, 1980);
        System.out.println(dateobj);
        student studentobj =  new student("Shiju", dateobj);
        System.out.println(studentobj);


    }

}