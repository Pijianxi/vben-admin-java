import{D as e,bn as s,a0 as n,F as t,G as i,K as r,L as a,w as o,a4 as p,N as d}from"./vendor.54f9b785.js";/* empty css              */import{c as m}from"./index.e2f51ec9.js";import{b as u}from"./index.0821d394.js";import"./index.27007487.js";/* empty css              *//* empty css              */import"./index.190d5090.js";import"./index.4e2c348d.js";import"./useWindowSizeFn.51649442.js";import"./useContentViewHeight.8c473bc3.js";/* empty css              */import"./useSortable.8cc8dd2e.js";import"./lock.66dce97a.js";var l=e({name:"InputNumberItem",components:{InputNumber:s},props:{event:{type:Number},title:{type:String}},setup(e){const{prefixCls:s}=m("setting-input-number-item");return{prefixCls:s,handleChange:function(s){e.event&&u(e.event,s)}}}});l.render=function(e,s,m,u,l,c){const f=n("InputNumber");return t(),i("div",{class:d(e.prefixCls)},[r("span",null,a(e.title),1),o(f,p(e.$attrs,{size:"small",class:`${e.prefixCls}-input-number`,onChange:e.handleChange}),null,16,["class","onChange"])],2)},l.__scopeId="data-v-19883dde";export{l as default};