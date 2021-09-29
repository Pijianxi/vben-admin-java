import{f as e}from"./index.e2f51ec9.js";var o,n;(n=o||(o={})).ACCOUNT_INFO="/account/info",n.SESSION_TIMEOUT="/user/sessionTimeout",n.TOKEN_EXPIRED="/user/tokenExpired",n.CHANGE_PASSWORD="/account/changePassword",n.ACCOUNT_EDIT="/account/edit";const s=()=>e.get({url:o.ACCOUNT_INFO}),a=n=>e.post({url:o.CHANGE_PASSWORD,params:n}),r=n=>e.post({url:o.ACCOUNT_EDIT,params:n}),p=[{key:"1",name:"基本设置",component:"BaseSetting"},{key:"2",name:"修改密码",component:"SecureSetting"}],l=[{field:"username",component:"Input",componentProps:{readonly:!0},label:"用户名",colProps:{span:18}},{field:"mobile",component:"Input",label:"手机号",colProps:{span:18}},{field:"email",component:"Input",label:"邮箱",colProps:{span:18}},{field:"nickname",component:"Input",label:"昵称",colProps:{span:18}},{field:"description",component:"InputTextArea",label:"个人简介",colProps:{span:18}}],t=[{field:"oldPassword",label:"当前密码",component:"InputPassword",required:!0},{field:"password",label:"新密码",component:"InputPassword",required:!0},{field:"confirmPassword",label:"确认密码",component:"InputPassword",dynamicRules:({values:e})=>[{required:!0,validator:(o,n)=>n?n!==e.password?Promise.reject("两次输入的密码不一致!"):Promise.resolve():Promise.reject("确认密码不能为空")}]}];export{s as a,l as b,r as c,a as d,t as p,p as s};