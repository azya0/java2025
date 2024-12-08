package TSK_311.TSK_311_2;

public class SeasonsExample {
    enum Season {
        WINTER("Winter", 1) {
            @Override
            public String getDescription() {
                return "Зимой холодно.. Ещё и курс по джаве сдавать надо";
            }

            @Override
            public String getActivity() {
                return "Решать курс по джаве";
            }
        },
        SPRING("Spring", 2) {
            @Override
            public String getDescription() {
                return "Тут теплеет, но все в грязи и слякоти";
            }

            @Override
            public String getActivity() {
                return "Отдыхать после зимней сессии";
            }
        },
        SUMMER("Summer", 3) {
            @Override
            public String getDescription() {
                return "Тепло и кайфово.. Если бы не комары и +30...";
            }

            @Override
            public String getActivity() {
                return "Отдыхать после вессенней сессии";
            }
        },
        FALL("Fall", 4) {
            @Override
            public String getDescription() {
                return "А че? Лето прошло? Опять работать?";
            }

            @Override
            public String getActivity() {
                return "Возвращаться в родной Политех на пары";
            }
        };

        private final String name;
        private final int order;

        Season(String name, int order) {
            this.name = name;
            this.order = order;
        }

        public String getName() {
            return name;
        }

        public int getOrder() {
            return order;
        }

        public abstract String getDescription();
        public abstract String getActivity();
    }

    public void printSeasonInfo() {
        for (Season season : Season.values()) {
            System.out.printf("%s (Order: %d) - %s\n", season.getName(), season.getOrder(), season.getDescription());
            System.out.println("Activity: " + season.getActivity());
            System.out.println();  // Пустая строка для разделения
        }
    }

    public static void main(String[] args) {
        SeasonsExample example = new SeasonsExample();
        example.printSeasonInfo();
    }
}
