function com_gwtext_sample_showcase_Showcase(){var k=window,j=document,s=k.external,t,p,o='',w={},E=[],B=[],n=[],y,A;if(!k.__gwt_stylesLoaded){k.__gwt_stylesLoaded={};}if(!k.__gwt_scriptsLoaded){k.__gwt_scriptsLoaded={};}var x=k.onload;k.onload=function(a){if(x){k.onload=x;k.onload(a);}p=true;v();};function u(){try{return s&&(s.gwtOnLoad&&k.location.search.indexOf('gwt.hybrid')== -1);}catch(a){return false;}}
function v(){if(t&&p){t(y,'com.gwtext.sample.showcase.Showcase',o);}}
function r(){var f,e;j.write('<script id="__gwt_marker_com.gwtext.sample.showcase.Showcase"><\/script>');e=j.getElementById('__gwt_marker_com.gwtext.sample.showcase.Showcase');if(e){f=e.previousSibling;}function c(b){var a=b.lastIndexOf('/');return a>=0?b.substring(0,a+1):'';}
;if(f&&f.src){o=c(f.src);}if(o==''){o=c(j.location.href);}else if(o.match(/^\w+:\/\//)){}else{var d=j.createElement('img');d.src=o+'clear.cache.gif';o=c(d.src);}if(e){e.parentNode.removeChild(e);}}
function z(){var f=document.getElementsByTagName('meta');for(var d=0,g=f.length;d<g;++d){var e=f[d],h=e.getAttribute('name'),b;if(h){if(h=='gwt:property'){b=e.getAttribute('content');if(b){var i,c=b.indexOf('=');if(c>=0){h=b.substring(0,c);i=b.substring(c+1);}else{h=b;i='';}w[h]=i;}}else if(h=='gwt:onPropertyErrorFn'){b=e.getAttribute('content');if(b){try{A=eval(b);}catch(a){alert('Bad handler "'+b+'" for "gwt:onPropertyErrorFn"');}}}else if(h=='gwt:onLoadErrorFn'){b=e.getAttribute('content');if(b){try{y=eval(b);}catch(a){alert('Bad handler "'+b+'" for "gwt:onLoadErrorFn"');}}}}}}
function m(a,b){return b in E[a];}
function l(a){var b=w[a];return b==null?null:b;}
function D(d,e){var a=n;for(var b=0,c=d.length-1;b<c;++b){a=a[d[b]]||(a[d[b]]=[]);}a[d[c]]=e;}
function q(d){var e=B[d](),b=E[d];if(e in b){return e;}var a=[];for(var c in b){a[b[c]]=c;}if(A){A(d,a,e);}throw null;}
B['user.agent']=function(){var d=navigator.userAgent.toLowerCase();var b=function(a){return parseInt(a[1])*1000+parseInt(a[2]);};if(d.indexOf('opera')!= -1){return 'opera';}else if(d.indexOf('webkit')!= -1){return 'safari';}else if(d.indexOf('msie')!= -1){var c=/msie ([0-9]+)\.([0-9]+)/.exec(d);if(c&&c.length==3){if(b(c)>=6000){return 'ie6';}}}else if(d.indexOf('gecko')!= -1){var c=/rv:([0-9]+)\.([0-9]+)/.exec(d);if(c&&c.length==3){if(b(c)>=1008)return 'gecko1_8';}return 'gecko';}return 'unknown';};E['user.agent']={'gecko':0,'gecko1_8':1,'ie6':2,'opera':3,'safari':4};com_gwtext_sample_showcase_Showcase.onScriptLoad=function(a){com_gwtext_sample_showcase_Showcase=null;t=a;v();};r();z();var C;try{D(['ie6'],'2AB3B231FF8483A70B6C9A50B85C106B');D(['opera'],'320EEAD85A53B863113FCBFE20BE7AA7');D(['safari'],'714DC0199BFCF646AE9C75C95A2600A3');D(['gecko1_8'],'9B987101069D1BD3234E06A936D53D80');D(['gecko'],'B2E18ADC84D8D255AF3C7207FEF8104A');C=n[q('user.agent')];}catch(a){return;}C+='.cache.js';j.write('<script src="'+o+C+'"><\/script>');}
com_gwtext_sample_showcase_Showcase.__gwt_initHandlers=function(i,e,j){var d=window,g=d.onresize,f=d.onbeforeunload,h=d.onunload;d.onresize=function(a){i();if(g)g(a);};d.onbeforeunload=function(a){var c=e();var b;if(f)b=f(a);if(c!==null)return c;return b;};d.onunload=function(a){j();if(h)h(a);};};com_gwtext_sample_showcase_Showcase();