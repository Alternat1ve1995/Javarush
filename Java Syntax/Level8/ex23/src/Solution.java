
/*
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Human   child1 = new Human("Child1", true, 10);
        Human   child2 = new Human("Child2", true, 15);
        Human   child3 = new Human("Child3", true, 20);

        Human   mother = new Human("Mother", false, 45, new ArrayList<>());
        Human   father = new Human("Father", true, 45, new ArrayList<>());

        Human   m_grandma = new Human("Mgrandma", false, 70, new ArrayList<>());
        Human   m_grandpa = new Human("Mgrandpa", true, 70, new ArrayList<>());

        Human   f_grandma = new Human("Fgrandma", false, 70, new ArrayList<>());
        Human   f_grandpa = new Human("Fgrandpa", true, 70, new ArrayList<>());

        f_grandma.children.add(father);
        f_grandpa.children.add(father);

        m_grandma.children.add(mother);
        m_grandpa.children.add(mother);

        mother.children.add(child1);
        father.children.add(child1);
        mother.children.add(child2);
        father.children.add(child2);
        mother.children.add(child3);
        father.children.add(child3);

        System.out.println(m_grandma.toString());
        System.out.println(m_grandma.toString());
        System.out.println(f_grandma.toString());
        System.out.println(f_grandpa.toString());
        System.out.println(mother.toString());
        System.out.println(father.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());
    }

    public static class Human {

        private String              name;
        private boolean             sex;
        private int                 age;
        public ArrayList<Human>     children = new ArrayList<>();

        public Human(String name, boolean sex, int age) {

            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {

            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
