import{c as e}from"./index.fcdcd43d.js";import{b as s}from"./index.8662dae9.js";import{D as i,bt as t,a0 as r,F as n,G as o,aa as a,ar as d,N as p,X as c,w as l}from"./vendor.54f9b785.js";import"./index.12c02a89.js";/* empty css              *//* empty css              */import"./index.72e9a499.js";import"./index.866e1221.js";import"./useWindowSizeFn.51649442.js";import"./useContentViewHeight.52e6f9d3.js";/* empty css              */import"./useSortable.b48b43c7.js";import"./lock.1da0a53b.js";var m=i({name:"ThemeColorPicker",components:{CheckOutlined:t},props:{colorList:{type:Array,defualt:[]},event:{type:Number},def:{type:String}},setup(i){const{prefixCls:t}=e("setting-theme-picker");return{prefixCls:t,handleClick:function(e){i.event&&s(i.event,e)}}}});const f=["onClick"];m.render=function(e,s,i,t,m,u){const x=r("CheckOutlined");return n(),o("div",{class:p(e.prefixCls)},[(n(!0),o(a,null,d(e.colorList||[],(s=>(n(),o("span",{key:s,onClick:i=>e.handleClick(s),class:p([`${e.prefixCls}__item`,{[`${e.prefixCls}__item--active`]:e.def===s}]),style:c({background:s})},[l(x)],14,f)))),128))],2)};export{m as default};
