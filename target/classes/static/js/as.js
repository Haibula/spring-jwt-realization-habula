switch (localStorage.getItem('month')) {
    case "1 семестр Сентябрь":
        document.getElementById("nas").href = 'september';
        break;
    case "1 семестр Октябрь":
        document.getElementById("nas").href = 'october';
        break;
    case "1 семестр Ноябрь":
        document.getElementById("nas").href = 'november';
        break;
    case "1 семестр Декабрь":
        document.getElementById("nas").href = 'december';
        break;
    case "2 семестр Январь":
        document.getElementById("nas").href = 'january';
        break;
    case "2 семестр Февраль":
        document.getElementById("nas").href = 'february';
        break;
    case "2 семестр Март":
        document.getElementById("nas").href = 'march';
        break;
    case "2 семестр Апрель":
        document.getElementById("nas").href = 'april';
        break;
}


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
];

for (let i = 0; i < list.length; i++) {
    for (let j = 0; j < user1.length; j++) {
        list.at(i).item(j).value = "-"
        list.at(i).item(j).setAttribute("onFocus", "this.select()")
    }
}