"undefined"!=typeof require&&require;var e=(e,t,i)=>new Promise(((s,r)=>{var o=e=>{try{n(i.next(e))}catch(t){r(t)}},a=e=>{try{n(i.throw(e))}catch(t){r(t)}},n=e=>e.done?s(e.value):Promise.resolve(e.value).then(o,a);n((i=i.apply(e,t)).next())}));import{g as t,h as i}from"./useForm.1f83b549.js";import{a as s}from"./article.data.56b44385.js";import{g as r,c as o,A as a,d as n}from"./article.faf6927b.js";import{D as d,b1 as l,a as c,_ as m,a0 as u,F as p,G as f,w as y}from"./vendor.54f9b785.js";/* empty css              *//* empty css              *//* empty css              *//* empty css              *//* empty css              *//* empty css              */import"./index.fcdcd43d.js";import"./index.ce2ad58c.js";import"./useWindowSizeFn.51649442.js";import"./onMountedOrActivated.fcde6c3c.js";import"./upload.c471add1.js";var h=d({name:"DeptModal",components:{BasicForm:t},emits:["success","register"],setup(){var t;const[d,{updateSchema:u,validate:p,setFieldsValue:f,resetFields:y}]=i({labelWidth:100,schemas:s,showSubmitButton:!0,submitButtonOptions:{text:"提交"}}),h=l(),j=c(),b=null==(t=h.query)?void 0:t.id;return m((()=>e(this,null,(function*(){const e=yield r({status:1});if(yield u({field:"categoryId",componentProps:{treeData:e}}),yield y(),b){const e=yield o(Number(b));yield f(e)}})))),{registerForm:d,handleSubmit:function(){return e(this,null,(function*(){try{const e=yield p();if(b){e.id=b,(yield a(e))&&(yield j.push({path:"/content/article/info"}))}else{(yield n(e))&&(yield j.push({path:"/content/article/info"}))}}finally{}}))}}}});const j={style:{padding:"50px"}};h.render=function(e,t,i,s,r,o){const a=u("BasicForm");return p(),f("div",j,[y(a,{onRegister:e.registerForm,onSubmit:e.handleSubmit},null,8,["onRegister","onSubmit"])])};export{h as default};
