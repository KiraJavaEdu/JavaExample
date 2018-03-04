package chapter3;

class IdCard{
    final String cardNO;
    String policeStation;
    IdCard(String cardNO, String policeStation){
        this.cardNO = cardNO;
        this.policeStation = policeStation;
    }
}

class Person{
    final IdCard idCard;
    Person(IdCard idCard){
        this.idCard = idCard;
    }
}

public class FinalReferenceTest{
    public static void main(String[] args){
        IdCard idCard = new IdCard("320924********2145", "****派出所");
        Person stu = new Person(idCard);
        System.out.println(stu.idCard);
        System.out.println(stu.idCard.policeStation);
        stu.idCard.policeStation = "北京市海淀区东升派出所";
        System.out.println(stu.idCard);
        System.out.println(stu.idCard.policeStation);
    }
}


