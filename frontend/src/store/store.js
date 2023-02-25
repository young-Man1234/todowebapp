import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex);


const storage = {
    fetch(){
        let num = 1;
        const arr = []
        localStorage.clear();
        var empName = ["한영민", "김아무개", "섹시가이"];
        for (let i = 0; i < empName.length; i++) {
            let emp = { ischeck: false, item: empName[i], empNo: num }
            localStorage.setItem(num++, JSON.stringify(emp));
        }

        for (let i = 0; i < localStorage.length; i++) {
            arr.push(JSON.parse(localStorage.getItem(localStorage.key(i))));
        }
        return arr;
    }
}


export const store = new Vuex.Store({
    state: {
        employees: storage.fetch(),
    },
    getters: {
        getEmployees(state){
            return state.employees
        }
    },
    mutations:{
        addEmployee(){
            console.log("ADD EMP");
        },
        removeEmp(state, payload){
            console.log(payload);
            localStorage.removeItem(payload.emp.empNo);
            state.employees.splice(payload.idx, 1);
        }
    },
    actions:{
        getEmployee(){
            
        }
    }
});