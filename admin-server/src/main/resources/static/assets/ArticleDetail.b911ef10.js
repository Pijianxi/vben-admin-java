"undefined"!=typeof require&&require;import{D as e,b1 as t,a,r as n,_ as i,a0 as r,F as o,a1 as c,a5 as s,w as l,K as d,L as p,ad as u}from"./vendor.54f9b785.js";import{a as f}from"./index.07fed524.js";import{j as m,a2 as v}from"./index.fcdcd43d.js";import{c as x}from"./article.faf6927b.js";/* empty css              *//* empty css              */import"./onMountedOrActivated.fcde6c3c.js";import"./useWindowSizeFn.51649442.js";import"./useContentViewHeight.52e6f9d3.js";const j=e({name:"ArticleDetail",components:{PageWrapper:f},setup(){var e;const r=t(),o=a(),c=m(),s=n(null==(e=r.params)?void 0:e.id),{setTitle:l}=v(),d=n({});function p(){return e=this,t=null,a=function*(){d.value=yield x(s.value),l("文章详情："+d.value.title)},new Promise(((n,i)=>{var r=e=>{try{c(a.next(e))}catch(t){i(t)}},o=e=>{try{c(a.throw(e))}catch(t){i(t)}},c=e=>e.done?n(e.value):Promise.resolve(e.value).then(r,o);c((a=a.apply(e,t)).next())}));var e,t,a}return i((()=>{p()})),{articleId:s,goBack:function(){c("/content/article/info")},articleInfo:d,editArticle:function(){o.push({path:"/content/article/article_edit",query:{id:s.value}})}}}}),y=u(" 编辑文章 "),g={class:"pt-4 m-4 desc-wrap"},h={style:{"text-align":"center"}},k={style:{padding:"100px 200px"}},w=["innerHTML"];j.render=function(e,t,a,n,i,u){const f=r("a-button"),m=r("PageWrapper");return o(),c(m,{title:"文章详情："+e.articleInfo.title,content:"",contentBackground:"",onBack:e.goBack},{extra:s((()=>[l(f,{type:"primary",onClick:e.editArticle},{default:s((()=>[y])),_:1},8,["onClick"])])),default:s((()=>[d("div",g,[d("p",h,p(e.articleInfo.title),1),d("p",k,[d("span",{innerHTML:e.articleInfo.content},null,8,w)])])])),_:1},8,["title","onBack"])};export{j as default};
