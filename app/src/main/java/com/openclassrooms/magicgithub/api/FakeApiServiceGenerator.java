package com.openclassrooms.magicgithub.api;

import com.openclassrooms.magicgithub.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public abstract class FakeApiServiceGenerator {


    static List<User> generateUsers() {
        return new ArrayList<>(FAKE_USERS);
    }

    public static List<User> FAKE_USERS_OLD = Arrays.asList(
            new User("001", "Jake", "https://api.adorable.io/AVATARS/512/1.png"),
            new User("002", "Paul", "https://api.adorable.io/AVATARS/512/2.png"),
            new User("003", "Phil", "https://api.adorable.io/AVATARS/512/3.png"),
            new User("004", "Guillaume", "https://api.adorable.io/AVATARS/512/4.png"),
            new User("005", "Francis", "https://api.adorable.io/AVATARS/512/5.png"),
            new User("006", "George", "https://api.adorable.io/AVATARS/512/6.png"),
            new User("007", "Louis", "https://api.adorable.io/AVATARS/512/7.png"),
            new User("008", "Mateo", "https://api.adorable.io/AVATARS/512/8.png"),
            new User("009", "April", "https://api.adorable.io/AVATARS/512/9.png"),
            new User("010", "Louise", "https://api.adorable.io/AVATARS/512/10.png"),
            new User("011", "Elodie", "https://api.adorable.io/AVATARS/512/11.png"),
            new User("012", "Helene", "https://api.adorable.io/AVATARS/512/12.png"),
            new User("013", "Fanny", "https://api.adorable.io/AVATARS/512/13.png"),
            new User("014", "Laura", "https://api.adorable.io/AVATARS/512/14.png"),
            new User("015", "Gertrude", "https://api.adorable.io/AVATARS/512/15.png"),
            new User("016", "Chloé", "https://api.adorable.io/AVATARS/512/16.png"),
            new User("017", "April", "https://api.adorable.io/AVATARS/512/17.png"),
            new User("018", "Marie", "https://api.adorable.io/AVATARS/512/18.png"),
            new User("019", "Henri", "https://api.adorable.io/AVATARS/512/19.png"),
            new User("020", "Rémi", "https://api.adorable.io/AVATARS/512/20.png")
    );

    public static List<User> FAKE_USERS_RANDOM_OLD = Arrays.asList(
            new User("021", "Lea", "https://api.adorable.io/AVATARS/512/21.png"),
            new User("022", "Geoffrey", "https://api.adorable.io/AVATARS/512/22.png"),
            new User("023", "Simon", "https://api.adorable.io/AVATARS/512/23.png"),
            new User("024", "André", "https://api.adorable.io/AVATARS/512/24.png"),
            new User("025", "Leopold", "https://api.adorable.io/AVATARS/512/25.png")
    );

    public static List<User> FAKE_USERS = Arrays.asList(
            new User("001", "Jake", "https://drive.google.com/uc?id=1L4zWlR3EMEs47SuofpapujjV-1xx41eP"),
            new User("002", "Paul", "https://drive.google.com/uc?id=1L5hsnQw6-79edwZapa-RbfXktgxrrinf"),
            new User("003", "Phil", "https://drive.google.com/uc?id=1LD_NIl9x4Q3pa7ZB-Ryxp6rwkHzRJgd6"),
            new User("004", "Guillaume", "https://drive.google.com/uc?id=1LF0q-JL9FhJI7Qcw0SSDuB1JR3CL0Eay"),
            new User("005", "Francis", "https://drive.google.com/uc?id=1LGiQf_ilxTWu4fj7LGzvW74kWIbRlahI"),
            new User("006", "George", "https://drive.google.com/uc?id=1LKBTkmoRztpgmaQIUEFKXB6WcmNc89cC"),
            new User("007", "Louis", "https://drive.google.com/uc?id=1M5DxzUttz-F6HxkVLxFHOtsLiL0UhKZt"),
            new User("008", "Mateo", "https://drive.google.com/uc?id=1M4s-1-kShr3Hz3_TTalKjVDoN0SjX4kG"),
            new User("009", "April", "https://drive.google.com/uc?id=1LdGLfOuGk-g0K6JB16qjy6O-WfwdGzh8"),
            new User("010", "Louise", "https://drive.google.com/uc?id=1LQn6A454abARjkAbDdVB1IBSsZ6qbS0I"),
            new User("011", "Elodie", "https://drive.google.com/uc?id=1LLEBL0GLiindDxDR11ZaD6XMIHaMfBrT"),
            new User("012", "Helene", "https://drive.google.com/uc?id=1Kp7mPlgC_skR18CovwvJmTkxEPv7iOnw"),
            new User("013", "Fanny", "https://drive.google.com/uc?id=1KyeuX3SJcWhZDhENKMQVw1Ma_Gtw1mAV"),
            new User("014", "Laura", "https://drive.google.com/uc?id=1Kp1RQB8-nGSSR77LLjRHFebR3H6eSLpz"),
            new User("015", "Gertrude", "https://drive.google.com/uc?id=1L56YWGdVRBwnY5QRsk5m58oOtbcETpKR"),
            new User("016", "Chloé", "https://drive.google.com/uc?id=1LKkOBvxtXyDlHcKWtqrVc1iTcZYWngUY"),
            new User("017", "April", "https://drive.google.com/uc?id=1LLEBL0GLiindDxDR11ZaD6XMIHaMfBrT"),
            new User("018", "Marie", "https://drive.google.com/uc?id=1LdGLfOuGk-g0K6JB16qjy6O-WfwdGzh8"),
            new User("019", "Henri", "https://drive.google.com/uc?id=1M5DxzUttz-F6HxkVLxFHOtsLiL0UhKZt"),
            new User("020", "Rémi", "https://drive.google.com/uc?id=1L8bb0Sb-DNB6GSaJvxIC9vTNWbI08Mqm")
    );

    public static List<User> FAKE_USERS_RANDOM = Arrays.asList(
            new User("021", "Lea", "https://drive.google.com/uc?id=1LGiQf_ilxTWu4fj7LGzvW74kWIbRlahI"),
            new User("022", "Geoffrey", "https://drive.google.com/uc?id=1LLEBL0GLiindDxDR11ZaD6XMIHaMfBrT"),
            new User("023", "Simon", "https://drive.google.com/uc?id=1M5DxzUttz-F6HxkVLxFHOtsLiL0UhKZt"),
            new User("024", "André", "https://drive.google.com/uc?id=1LdGLfOuGk-g0K6JB16qjy6O-WfwdGzh8"),
            new User("025", "Leopold", "https://drive.google.com/uc?id=1L4zWlR3EMEs47SuofpapujjV-1xx41eP"),
            new User("026", "Pepe", "https://drive.google.com/uc?id=1MX8Sp98Ea5uC54b-YxRl7r0d559r7Jri"),
            new User("027", "Filou", "https://drive.google.com/uc?id=1MekYfvo4II81g-pjUGzKwi3q_pNzWAA2"),
            new User("028", "Matthieu", "https://drive.google.com/uc?id=13Y7GE9n1vLPPrr1w9jEnmFr2C1hH6fA9"),
            new User("029", "Cynthia", "https://drive.google.com/uc?id=1PshLnOVZhzzM3kKHkF4uqH0gGsFfR-Eo")
    );
}
