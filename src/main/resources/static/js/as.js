switch (localStorage.getItem('month')) {
    case "1 семестр Сентябрь":
        document.getElementById("nas").href = 'semester_1/september';
        break;
    case "1 семестр Октябрь":
        document.getElementById("nas").href = 'semester_1/october';
        break;
    case "1 семестр Ноябрь":
        document.getElementById("nas").href = 'semester_1/november';
        break;
    case "1 семестр Декабрь":
        document.getElementById("nas").href = 'semester_1/december';
        break;
    case "2 семестр Январь":
        document.getElementById("nas").href = 'semester_2/january';
        break;
    case "2 семестр Февраль":
        document.getElementById("nas").href = 'semester_2/february';
        break;
    case "2 семестр Март":
        document.getElementById("nas").href = 'semester_2/march';
        break;
    case "2 семестр Апрель":
        document.getElementById("nas").href = 'semester_2/april';
        break;
    case "2 семестр Май":
        document.getElementById("nas").href = 'semester_2/may';
        break;
    case "2 семестр Июнь":
        document.getElementById("nas").href = 'semester_2/june';
        break;
    case "1 семестр Экзамены, и.т.д":
        document.getElementById("nas").href = 'semester_1/special_grade';
        break;
    case "2 семестр Экзамены, и.т.д":
        document.getElementById("nas").href = 'semester_2/special_grade';
        break;
}
// придумай что делать с 2 курсом