import{A as s,a as l,b as e,u as t,c as a,d as o,e as i}from"./index.e2f51ec9.js";import n from"./LoginForm.b05025cc.js";import{D as r,j as x,a0 as m,F as p,G as c,a1 as d,ac as f,K as u,w as g,L as w,N as v}from"./vendor.54f9b785.js";/* empty css              *//* empty css              */import"./LoginFormTitle.fbab216c.js";var h=r({name:"Login",components:{AppLogo:s,LoginForm:n,AppLocalePicker:l,AppDarkModeToggle:e},props:{sessionTimeout:{type:Boolean}},setup(){const s=t(),{prefixCls:l}=a("login"),{t:e}=o(),n=i();return{t:e,prefixCls:l,title:x((()=>{var l;return null!=(l=null==s?void 0:s.title)?l:""})),showLocale:n.getShowPicker}}});const y={class:"-enter-x xl:hidden"},b={class:"container relative h-full py-2 mx-auto sm:px-10"},L={class:"flex h-full"},j={class:"hidden min-h-full pl-4 mr-4 xl:flex xl:flex-col xl:w-6/12"},k={class:"my-auto"},T=["alt"],A={class:"mt-10 font-medium text-white -enter-x"},F={class:"inline-block mt-4 text-3xl"},C={class:"mt-5 font-normal text-white text-md dark:text-gray-500 -enter-x"},D={class:"flex w-full h-full py-5 xl:h-auto xl:py-0 xl:my-0 xl:w-6/12"};h.render=function(s,l,e,t,a,o){const i=m("AppDarkModeToggle"),n=m("AppLogo"),r=m("LoginForm");return p(),c("div",{class:v([s.prefixCls,"relative w-full h-full px-4"])},[s.sessionTimeout?f("",!0):(p(),d(i,{key:0,class:"absolute top-3 right-7 enter-x"})),u("span",y,[g(n,{alwaysShowTitle:!0})]),u("div",b,[u("div",L,[u("div",j,[g(n,{class:"-enter-x"}),u("div",k,[u("img",{alt:s.title,src:"/assets/login-box-bg.9027741f.svg",class:"w-1/2 -mt-16 -enter-x"},null,8,T),u("div",A,[u("span",F,w(s.t("sys.login.signInTitle")),1)]),u("div",C,w(s.t("sys.login.signInDesc")),1)])]),u("div",D,[u("div",{class:v([`${s.prefixCls}-form`,"relative w-full px-5 py-8 mx-auto my-auto rounded-md shadow-md xl:ml-16 xl:bg-transparent sm:px-8 xl:p-4 xl:shadow-none sm:w-3/4 lg:w-2/4 xl:w-auto enter-x"])},[g(r)],2)])])])],2)};export{h as default};