let list = [
    user1 = document.getElementsByName("user1Grades"),
    user2 = document.getElementsByName("user2Grades"),
    user3 = document.getElementsByName("user3Grades"),
    user4 = document.getElementsByName("user4Grades"),
    user5 = document.getElementsByName("user5Grades"),
    user6 = document.getElementsByName("user6Grades"),
    user7 = document.getElementsByName("user7Grades"),
    user8 = document.getElementsByName("user8Grades"),
    user9 = document.getElementsByName("user9Grades"),
    user10 = document.getElementsByName("user10Grades"),
    user11 = document.getElementsByName("user11Grades"),
    user12 = document.getElementsByName("user12Grades"),
    user13 = document.getElementsByName("user13Grades"),
    user14 = document.getElementsByName("user14Grades"),
    user15 = document.getElementsByName("user15Grades"),
    user16 = document.getElementsByName("user16Grades"),
    user17 = document.getElementsByName("user17Grades"),
    user18 = document.getElementsByName("user18Grades"),
    user19 = document.getElementsByName("user19Grades"),
    user20 = document.getElementsByName("user20Grades"),
    user21 = document.getElementsByName("user21Grades"),
    user22 = document.getElementsByName("user22Grades"),
    user23 = document.getElementsByName("user23Grades"),
    user24 = document.getElementsByName("user24Grades"),
    user25 = document.getElementsByName("user25Grades"),
    user26 = document.getElementsByName("user26Grades"),
    user27 = document.getElementsByName("user27Grades"),
    user28 = document.getElementsByName("user28Grades"),
    user29 = document.getElementsByName("user29Grades"),
    user30 = document.getElementsByName("user30Grades"),
    user31 = document.getElementsByName("user31Grades"),
    user32 = document.getElementsByName("user32Grades"),
    user33 = document.getElementsByName("user33Grades"),
    user34 = document.getElementsByName("user34Grades"),
    user35 = document.getElementsByName("user35Grades"),
    user36 = document.getElementsByName("user36Grades"),
    user37 = document.getElementsByName("user37Grades"),
    user38 = document.getElementsByName("user38Grades"),
    user39 = document.getElementsByName("user39Grades"),
    user40 = document.getElementsByName("user40Grades"),
];

for (let i = 0; i < list.length; i++) {
    for (let j = 0; j < user1.length; j++) {
        list.at(i).item(0).value = i + 1
        list.at(i).item(j).setAttribute("onFocus", "this.select()")
    }
}