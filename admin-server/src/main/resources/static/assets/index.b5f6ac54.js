import{C as e,p as o,c as a,h as s,j as t,d as r,P as n}from"./index.e2f51ec9.js";import{D as i,az as c,aA as l,j as d,a0 as p,F as u,G as m,w as f,a5 as g,a1 as k,ac as x,K as h,N as _,L as C,aa as j}from"./vendor.54f9b785.js";import{c as w,u as D}from"./index.190d5090.js";import{u as L}from"./index.65d44f44.js";import{h as v}from"./header.d801b988.js";import"./index.4e2c348d.js";import"./useWindowSizeFn.51649442.js";import"./useContentViewHeight.8c473bc3.js";/* empty css              *//* empty css              */import"./useSortable.8cc8dd2e.js";import"./lock.66dce97a.js";var b=i({name:"UserDropdown",components:{Dropdown:c,Menu:l,MenuItem:w((()=>e((()=>import("./DropMenuItem.493ba92b.js")),["assets/DropMenuItem.493ba92b.js","assets/vendor.54f9b785.js","assets/vendor.bd035476.css","assets/index.e2f51ec9.js","assets/index.87cbc01e.css"]))),MenuDivider:l.Divider,LockAction:w((()=>e((()=>import("./LockModal.d25ecdc9.js")),["assets/LockModal.d25ecdc9.js","assets/LockModal.0068f88c.css","assets/index.55e05163.css","assets/index.ccc15a38.css","assets/index.35b5cf30.css","assets/index.c4896195.css","assets/index.553174f4.css","assets/index.317f90e2.css","assets/index.e2f51ec9.js","assets/index.87cbc01e.css","assets/vendor.54f9b785.js","assets/vendor.bd035476.css","assets/index.65d44f44.js","assets/index.b3b32c91.css","assets/useWindowSizeFn.51649442.js","assets/useForm.c60a0e05.js","assets/useForm.db8a3c82.css","assets/lock.66dce97a.js","assets/header.d801b988.js"])))},props:{theme:o.oneOf(["dark","light"])},setup(){const{prefixCls:e}=a("header-user-dropdown"),{t:o}=r(),{getShowDoc:i,getUseLockPage:c}=D(),l=s(),p=t(),u=d((()=>{const{realName:e="",avatar:o,desc:a}=l.getUserInfo||{};return{realName:e,avatar:o||v,desc:a}})),[m,{openModal:f}]=L();return{prefixCls:e,t:o,getUserInfo:u,handleMenuClick:function(e){switch(e.key){case"logout":l.confirmLoginOut();break;case"doc":p(n.ACCOUNT_SETTING);break;case"lock":f(!0)}},getShowDoc:i,register:m,getUseLockPage:c}}});const y=["src"];b.render=function(e,o,a,s,t,r){const n=p("MenuItem"),i=p("MenuDivider"),c=p("Menu"),l=p("Dropdown"),d=p("LockAction");return u(),m(j,null,[f(l,{placement:"bottomLeft",overlayClassName:`${e.prefixCls}-dropdown-overlay`},{overlay:g((()=>[f(c,{onClick:e.handleMenuClick},{default:g((()=>[e.getShowDoc?(u(),k(n,{key:"doc",text:"个人设置",icon:"ant-design:info-circle-outlined"})):x("",!0),e.getShowDoc?(u(),k(i,{key:1})):x("",!0),e.getUseLockPage?(u(),k(n,{key:"lock",text:e.t("layout.header.tooltipLock"),icon:"ion:lock-closed-outline"},null,8,["text"])):x("",!0),f(n,{key:"logout",text:e.t("layout.header.dropdownItemLoginOut"),icon:"ion:power-outline"},null,8,["text"])])),_:1},8,["onClick"])])),default:g((()=>[h("span",{class:_([[e.prefixCls,`${e.prefixCls}--${e.theme}`],"flex"])},[h("img",{class:_(`${e.prefixCls}__header`),src:e.getUserInfo.avatar},null,10,y),h("span",{class:_(`${e.prefixCls}__info hidden md:block`)},[h("span",{class:_([`${e.prefixCls}__name  `,"truncate"])},C(e.getUserInfo.realName),3)],2)],2)])),_:1},8,["overlayClassName"]),f(d,{onRegister:e.register},null,8,["onRegister"])],64)};export{b as default};