"undefined"!=typeof require&&require;import{_ as e,u as t}from"./useTable.f9f7adae.js";import{_ as n}from"./useForm.c60a0e05.js";import{c as i,i as o}from"./system.2d3d3d5c.js";import{u as a}from"./index.65d44f44.js";import{_ as s,c as r,s as d}from"./DeptModal.17bef047.js";import{D as l,a0 as c,bc as u,F as m,G as p,w as f,a5 as b,H as h,ad as j}from"./vendor.54f9b785.js";/* empty css              */import"./index.20bb0a40.js";import"./index.e2f51ec9.js";/* empty css              *//* empty css              */import"./onMountedOrActivated.fcde6c3c.js";import"./useWindowSizeFn.51649442.js";import"./useContentViewHeight.8c473bc3.js";/* empty css              *//* empty css              *//* empty css              *//* empty css              */import"./useSortable.8cc8dd2e.js";/* empty css              *//* empty css              */var x=l({name:"DeptManagement",components:{BasicTable:e,DeptModal:s,TableAction:n},setup(){const[e,{openModal:n}]=a(),[s,{reload:l}]=t({title:"部门列表",api:i,columns:r,formConfig:{labelWidth:120,schemas:d},pagination:!1,striped:!1,useSearchForm:!0,showTableSetting:!0,bordered:!0,showIndexColumn:!1,canResize:!1,actionColumn:{width:80,title:"操作",dataIndex:"action",slots:{customRender:"action"},fixed:void 0}});function c(){l()}return{registerTable:s,registerModal:e,handleCreate:function(){n(!0,{isUpdate:!1})},handleEdit:function(e){n(!0,{record:e,isUpdate:!0})},handleDelete:function(e){return t=this,n=null,i=function*(){(yield o(e.id))&&c()},new Promise(((e,o)=>{var a=e=>{try{r(i.next(e))}catch(t){o(t)}},s=e=>{try{r(i.throw(e))}catch(t){o(t)}},r=t=>t.done?e(t.value):Promise.resolve(t.value).then(a,s);r((i=i.apply(t,n)).next())}));var t,n,i},handleSuccess:c}}});const g=j(" 新增部门 ");x.render=function(e,t,n,i,o,a){const s=c("a-button"),r=c("TableAction"),d=c("BasicTable"),l=c("DeptModal"),j=u("auth");return m(),p("div",null,[f(d,{onRegister:e.registerTable},{toolbar:b((()=>[h(f(s,{type:"primary",onClick:e.handleCreate},{default:b((()=>[g])),_:1},8,["onClick"]),[[j,"dept:btn:add"]])])),action:b((({record:t})=>[f(r,{actions:[{icon:"clarity:note-edit-line",onClick:e.handleEdit.bind(null,t),auth:["dept:btn:edit"]},{icon:"ant-design:delete-outlined",color:"error",auth:["dept:btn:delete"],popConfirm:{title:"是否确认删除",confirm:e.handleDelete.bind(null,t)}}]},null,8,["actions"])])),_:1},8,["onRegister"]),f(l,{onRegister:e.registerModal,onSuccess:e.handleSuccess},null,8,["onRegister","onSuccess"])])};export{x as default};