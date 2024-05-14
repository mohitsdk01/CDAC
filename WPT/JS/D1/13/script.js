// 13. Create an array that holds 4 employee objects and displays each emp detail in a table. Employee details
// could be empid, empname and salary. Use for each loop to inspect all properties of each object.

// alert("here")

function showDetails(event){
    event.preventDefault();
    var employee = [
        { empid: 1, empname: "Mohit", salary: 10000 },
        { empid: 2, empname: "Linay", salary: 20000 },
        { empid: 3, empname: "Ram", salary: 30000 },
        { empid: 4, empname: "Keshav", salary: 40000 }
    ]
    var str = "<p>"
    employee.forEach((employee)=>{
        str += `Employee ID: ${employee.empid} Employee Name: ${employee.empname} Employee Salary:${employee.salary}</p><br>`
    })
    document.getElementById('result').innerHTML = str;
}
