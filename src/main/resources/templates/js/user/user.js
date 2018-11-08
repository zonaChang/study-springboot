$(function () {
    $("#btn").click(function () {
        $.ajax({
            url: "/boot/api/student/getStuByName",
            data: {name: "namexxxx"},
            dataType: "json",
            success: function (result) {
                $("#context").text(result)
            }

        });

    });
});