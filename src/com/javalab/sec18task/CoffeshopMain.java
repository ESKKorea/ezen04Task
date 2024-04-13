package com.javalab.sec18task;


public class CoffeshopMain {
    public static void main(String[] args) {


        CategoryDate[] categorydates = {
                new CategoryDate(1, "Coffee", "All types of coffee drinks"),
                new CategoryDate(2, "Latte", "Various kinds of lattes"),
                new CategoryDate(3, "Ade/Shake", "Fresh ades and shakes"),
                new CategoryDate(4, "Smoothie/Juice", "Healthy smoothies and juices"),
                new CategoryDate(5, "Bakery", "Fresh baked goods"),
                new CategoryDate(6, "Tea", "Traditional and herbal teas")
        };

        Employee[] employees = {
                new Employee(201, "Alice", "사원", 30000),
                new Employee(202, "Bob", "대리", 40000),
                new Employee(203, "Charlie", "과장", 50000),
                new Employee(204, "David", "사원", 32000),
                new Employee(205, "Eve", "대리", 42000),
                };

        // 10가지 주문데이터 생성
        Orderdate[] orderdates = {
                new Orderdate(38167668, "2017-09-13 10:15", employees[0].getId(), 1, 1),
                new Orderdate(89217297, "2017-09-13 10:20", employees[1].getId(), 12, 2),
                new Orderdate(39178816, "2017-09-13 10:40", employees[2].getId(), 13, 3),
                new Orderdate(63105816, "2017-09-13 10:05", employees[3].getId(), 14, 4),
                new Orderdate(47018158, "2017-09-13 11:15", employees[4].getId(), 15, 5),
                new Orderdate(46078737, "2017-09-13 11:25", employees[0].getId(), 16, 6),
                new Orderdate(32215456, "2017-09-13 11:35", employees[1].getId(), 17, 7),
                new Orderdate(60728464, "2017-09-13 11:45", employees[2].getId(), 18, 3),
                new Orderdate(99145980, "2017-09-13 11:50", employees[0].getId(), 19, 2),
                new Orderdate(65700654, "2017-09-13 12:00", employees[1].getId(), 20, 1),
        };
        ProductDate[] productdates = {
                new ProductDate(1, "카라멜마끼아또", 1, 5000),
                new ProductDate(2, "홍차라떼", 2, 5000),
                new ProductDate(3, "초코라떼", 2, 5000),
                new ProductDate(4, "오레오", 3, 5000),
                new ProductDate(5, "카라멜마끼아또", 1, 5000),
                new ProductDate(6, "초코라떼", 2, 4500),
                new ProductDate(7, "복숭아스무디", 4, 5000),
                new ProductDate(8, "커피콩빵", 5, 3000),
                new ProductDate(9, "바니라라떼", 1, 5000),
                new ProductDate(10, "매실차", 6, 4500),
                new ProductDate(11, "깔라만시", 6, 4500),
                new ProductDate(12, "카페라떼", 1, 4000),
                new ProductDate(13, "헤이즐넛라떼", 1, 5000),
                new ProductDate(14, "카라멜마끼아또", 1, 5000),
                new ProductDate(15, "아메리카노", 1, 4000),
                new ProductDate(16, "캐모마일", 6, 4500),
                new ProductDate(17, "아포가또", 3, 5500),
                new ProductDate(18, "비엔나커피", 1, 5000),
                new ProductDate(19, "베이글", 5, 3500),
                new ProductDate(20, "카푸치노", 1, 4000),
                new ProductDate(21, "허니브레드", 5, 6000),
                new ProductDate(22, "카페모카", 1, 5000),
                new ProductDate(23, "얼그레이", 6, 4500),
                new ProductDate(24, "히비아이스트", 3, 5000),
                new ProductDate(25, "플레인 와플", 5, 6000),
                new ProductDate(26, "요거트", 3, 5500),
                new ProductDate(27, "유자스무디", 4, 5000),
                new ProductDate(28, "딸기스무디", 4, 5000)
        };

        // 전 사원 출력
        System.out.println("전체 카테고리 데이터");
        printCategoryDate(categorydates);
        System.out.println();

        System.out.println("전체 상품 데이터");
        printProductDate(productdates, categorydates);
        System.out.println();


        System.out.println("전체 주문 데이터");
        printOrderdates(orderdates , employees , productdates);
        System.out.println();


        System.out.println("전체 사원 정보:");
        printEmployees(employees);
        System.out.println();



    }  // END OF MAIN ^^

    //카테고리 출력
    public static void printCategoryDate(CategoryDate[] categorydates){
        System.out.println("카테고리번호, 카테고리명 , 카테고리 설명");
        for (CategoryDate ctd : categorydates){
            System.out.println(ctd.getCategoryId() + " / " +ctd.getCategoryName() +" / " + ctd.getCategoryDescription());
        }
    }

    //상품 데이터 출력

    public static void printProductDate(ProductDate[] productdates, CategoryDate[] categorydates){
        System.out.println("상품번호 , 상품명 ,카테고리 ,판매단가");
        for (ProductDate pdd : productdates) {
            String categoryName = findCategoryName(pdd.getProductCategory(), categorydates);
            System.out.println(pdd.getProductId() + " " + pdd.getProductName() + " " + categoryName + " " + " " + pdd.getPrice());
        }
    }

    public static void printOrderdates (Orderdate[] orderdates, Employee[] employees, ProductDate[] productdates) {
        System.out.println("주문번호 주문날짜 주문처리직원ID 판매상품Id 판매수량");
        for (Orderdate odr : orderdates) {
            // 주문 처리 직원의 ID 대신에 직원의 이름을 가져와서 출력
            String employeeName = findEmployeeName(odr.getOrderEmployeeId(), employees);

            // 상품 ID를 사용하여 상품명 찾기
            String productName = findProductName(odr.getOrderProductId(), productdates);

            System.out.println(odr.getOrderId() + " " + odr.getOrderDay() + " " + employeeName + " " + productName + " " + odr.getSalesQuantity());
        }
    }

    // 사원 정보 출력 메소드
    public static void printEmployees(Employee[] employees) {
        System.out.println("사원번호 이름 직급 급여");
        for (Employee emp : employees) {
            System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getPosition() + " " + emp.getSalary());
        }
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////











    // 직원 ID로 직원 이름 찾기

    public static String findEmployeeName(int employeeId, Employee[] employees) {
        for (Employee emp : employees) {
            if (emp.getId() == employeeId) {
                return emp.getName();
            }
        }
        return "직원을 찾을 수 없습니다.";
    }

    // 상품 ID로 상품 이름 찾기

    public static String findProductName(int productId, ProductDate[] productdates) {
        for (ProductDate pdd : productdates) {
            if (pdd.getProductId() == productId) {
                return pdd.getProductName();
            }
        }
        return "상품을 찾을 수 없습니다.";
    }

    // 상품 카테고리명으로 카테고리명 찾기

    public static String findCategoryName(int categoryId, CategoryDate[] categorydates) {
        for (CategoryDate ctd : categorydates) {
            if (ctd.getCategoryId() == categoryId) {
                return ctd.getCategoryName();
            }
        }
        return "카테고리를 찾을 수 없습니다.";
    }


}












