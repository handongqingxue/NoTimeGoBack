package com.noTimeGoBack.util;

public class Part2Util {

	/**
	 * 第11章标题
	 */
	public static final String CHAP11_TIT_NAME="第11章 西蒙与女孩";
	/**
	 * 第12章标题
	 */
	public static final String CHAP12_TIT_NAME="第12章 狐狸与脚印";
	/**
	 * 第13章标题
	 */
	public static final String CHAP13_TIT_NAME="第13章 大闹黑风寨";
	
	public static final String CHAP11_IMAGE_PATH=Contant.IMAGE_PATH+"011";
	
	public static String getChapterByNum(int num) {
		String content=null;
		switch (num) {
		case 11:
			content=getChapter11();
			break;
		case 12:
			content=getChapter12();
			break;
		}
		return content;
	}

	/**
	 * 获得第11章内容
	 * @return
	 */
	public static String getChapter11() {
		
		StringBuilder sb=new StringBuilder();
		sb.append("<div class=\"main_div\">");
			sb.append("<div class=\"chapter_div\">");
				sb.append("<h1 class=\"title_div\">");
					sb.append(CHAP11_TIT_NAME);
				sb.append("</h1>");
				sb.append("<div class=\"content_div\">");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“啪。。。啪。。。”山寨里响起了一声声鞭子挥舞的声音，有位男子手持长鞭鞭策几位男女老少搬着一坛坛酒往屋里抬。这几个人里最老的有将近七十岁了，光着脚行走，脚上裂了好几道口子，渗出了鲜血。最幼的也有十五六岁，是位少女，脚上穿着沙滩凉鞋和白色棉袜(<a class=\"img_a\" href=\""+CHAP11_IMAGE_PATH+"001.jpg\" target=\"_blank\">图</a>)，袜筒处带着蓝色线。现在正值流火七月时节，脚上这么穿看起来正常。但女子自从得到这双沙滩凉鞋后，一年四季都穿着它，没有别的鞋穿，女子行走起来倒是比那位老人家轻松点，只是白袜踩在泥土上有些变色。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("这位女子名叫“杨兰春”，再过一周就十五岁了。十年前五岁生日那天晚上被巨蝎绑架到了黑风洞，一直关押在洞里当苦力。刚挟持过来时光着脚，后来被迫下山打水，日复一日年复一年的过了八年。就在前年，有次下山打水时路过一处摊位。摊主是卖鞋的，当时是盛夏季，见她光着脚走路，就送她一双沙滩凉鞋。兰春光脚走路已经很多年了，光脚穿上凉鞋感觉正合适。刚要走摊主叫住她，说这一带蜱虫较多，最好穿上袜子，防止皮肤病，说着又送她一双白色棉袜。兰春穿上棉袜又穿上凉鞋，感觉走起路来比光脚舒服多了，再三感谢摊主便离开了。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("讲到这里，细心的读者会问：“兰春既然有机会下山打水，为何不找机会逃回家呢？”其实兰春何尝没有逃过，逃过好几次，但却无法找到来时的路。离这里几里的东南方有一座山林叫“黑枫林”，在兰春小时候，老杨经常带着她到树林里打猎，兰春也聪明伶俐，来过两次就知道树林里的路怎样走通往哪里。可自从被抓来山寨后，几次经过黑枫林却总是迷路，老是循环走不出去，更别提找回家了。她也问过那位摊主和集市上的几家商贩，都对此不解，说没有人敢去黑枫林，有些人去了再也没有回来过，就那样失踪了。听到这里，兰春更是不敢再去，便放弃了回家的念头。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("钱钟书先生在围城里说过：“城内守城的想出城，城外攻城的想进城。”除了兰春回不去外，兰春的家人也曾好几次试着来找她，但有几次经过黑枫林差点困死在里面。有位书生叫“西蒙”，大概不到二十岁，曾在红尘客栈对面的学堂里读私塾，认识兰春，到她家作过几次客。西蒙对兰春情有独钟，想等她年龄稍微大些就娶她，却遭到家人反对，嫌两人年龄相差好几岁。夏天温度很高，西蒙除了到私塾念书外，其他时候浑身上下都只穿一条红色裤衩。最近西蒙从国外留学毕业回到了村里，能说一口流利的英语。听说兰春被土匪挟持走了，便奋不顾身的只穿了条红裤衩就去救她。西蒙练过太极、相扑，是位摔跤高手，参加过很多次国际相比大赛，面对好几国的相扑高手从无败绩。虽然如此，但好虎敌不过一群狼。很多村民都再三劝他别去就公主，别赔了夫人又折兵。西蒙见心爱的人被掳走了，不顾自己的性命也得去试一试。村民们苦劝不得，只好许诺，假如西蒙能救出公主活着回来，就做很多道他最喜欢吃的山珍海味来犒劳他。兰春的父母也答应，只要他能把公主活着救回来，到时候就给两人举办婚事。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("黑枫林每到夜晚都会发生一系列灵异事件，村民们都劝西蒙白天去救公主，这样危险系数能小些。西蒙却不顾阻拦，觉得耽搁一天，公主的危险就增大一天，执意要今晚就动身出发。流火天气，树林里到了晚上格外闷热，好比到了太上老君的八卦炉里一样，西蒙只好只穿着红裤衩就进入了树林。村民们不放心，暗地里派了几位猎户跟随其后保护他。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("西蒙虽然只穿着一条红裤衩，其他部分都露着身体，但手里紧握长鞭、裤衩里还藏着旋回镖。走了一段路来到了一片墓地（之前葛申来到的那片墓地），墓地里燃起了一片鬼火，很多幽灵似的会飞的东西从墓地里成群结队的冒了出来，弥漫在西蒙周围，把他围在了中间，包括上面也有，就像一个大罩子把西蒙裹在里面。后面几位猎户老远就看到了这一幕，上好子弹准备冲上去营救西蒙。正在这时，那些幽灵似的鬼火从中间部位裂开了一道口子，原来是西蒙得心应手的操作起了回旋镖，把它们打的节节败退，一个个鬼火像云烟一样散去，消失在死气沉沉的空气里。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“这点伎俩还奈何的了我西蒙。”西蒙自言自语道，继续往西北方向走。猎户见西蒙安然无恙，暂时松了口气，继续往前走保护着他。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("过了那片墓地往北走很快就会进入迷林区域。但往西北方向走，要过几里地才能进入迷林。有段路上无任何障碍，只是抬头看到上面的树叶遮盖住了夜空，好像魔抓似的形状比较恐怖，但对于西蒙来说这些都不屑一顾。后面几位猎人却异常谨慎的跟在西蒙后面，与其说跟在西蒙后面，不如说是西蒙走在他们前面开路，但西蒙并不知道他们在其后保护他。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("走了一会，天上飞来五六个类似骑士似的士兵，身穿盔甲，前面戴着盾牌，朝西蒙飞来。西蒙还是和上一关一样扔出了手里的回旋镖，可这次不和上次一样打到那些鬼火就散了，这次打在盔甲兵的盾牌上发出“当”的一声响，回旋镖好似害怕似的飞了回来，西蒙伸手接住了。盔甲兵继续朝西蒙方向下落，西蒙跳到了树上，朝其中一位挥出长鞭，还是和回旋镖一样，当的一声打在盾牌上没有造成任何伤害。盔甲兵眼看就要袭击到西蒙，西蒙立刻从树上跳了下来，树被盔甲兵撞到后削成了两截。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("西蒙从容稳重的落在地上，回旋镖和长鞭依然握在手里，只是裤衩前面的部分鼓了起来。“哈哈。。。吓尿了吧？小子，识相的尽快回去吧，我知道你是来救公主的，别妄想了，不用说你，就算齐天大圣来了也别想救出公主。”一个阴森森的声音讽刺道：");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("西蒙碰了碰裤衩前面，说：“你才吓尿了，我是位正常的男人而已。男子汉大丈夫既然来了就一定要救出公主，就凭你们这帮小喽啰还想阻拦？尽早滚一边去。”猎户老远看见，感觉西蒙要和这帮盔甲兵即将展开下一回合战斗，真想上去助一臂之力。但想到他们几个虽然是打猎出身，但加起来也未必是西蒙对手，何况手里只有枪，刚才也看到了，这帮盔甲兵刀枪不入，现在现身只能帮倒忙。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("几位盔甲兵一起朝西蒙袭来，西蒙抿着嘴笑了笑，看上去并不害怕。在他们距离西蒙大约两丈远时，西蒙突然间在地上滚来滚去，看上去并不想正面与他们交锋，任凭盔甲兵们怎样袭击，西蒙一直躲闪。不一会，西蒙突然又扔出了回旋镖，盔甲兵们却没放在眼里，这招刚才都不起作用，就用盾牌格挡。但西蒙手势突然间变化了，回旋镖并没有打在盾牌上，而是绕过盾牌打在一位盔甲兵身后。盔甲虽然坚硬，但回旋镖想穿透它还是绰绰有余。随着“啊。。。”一声惨叫，被打中的盔甲兵从空中落了下来，重重的摔在地上，没有了气息。原来西蒙找到了他们的弱点，盾牌虽然坚硬无比，但只能保护身前，身后无法保护。移动盾牌的速度远不如回旋镖飞的速度快，令人猝不及防。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("剩下的几个盔甲兵见一位挂了，用心观察回旋镖的移动方向，不让西蒙钻空子。尽管这样，回旋镖飞来飞去绕花了他们的视线，一位接着一位挂掉。最后只剩一位，但心思不放在如何袭击西蒙了，而是放在如何逃离上去。便飞向高空，飞出好几丈高。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“想逃？没门！”西蒙用力扔出回旋镖，回旋镖一直冲向苍穹，好像抛弃了空气阻力和地心引力，没有停下来的意思。离盔甲兵越来越近，随着一声“啊”，最后一位盔甲兵也从万里高空落了下来，重重的摔死在地上，随后一根树枝落在其身上。回旋镖回到了西蒙手里，西蒙继续朝西北方向前进，几位猎户上去脱下盔甲兵尸体上的盔甲，穿在自己身上，手持盾牌扮成盔甲兵的样子继续跟着西蒙前行。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("西蒙连过两关，感觉游刃有余。连休息也顾不上，就继续加快脚步往前闯，几个猎户在后面跟着他。走了一段距离，有座破旧的居民楼出现在面前，居民楼一共有五层，每层却有好几扇窗户，上面都没有玻璃，而且杂乱无章的排列着，里面黑洞洞的看不清。要继续走下去，这座破旧的居民楼是必经之地。西蒙走到离居民楼十来米远时，二楼的几扇窗口里突然亮起了红色的灯，仔细一看，哪里是灯啊，分明是一双双红色的眼睛。要是普通人看到这一双双鬼眼早就吓破了胆，就连西蒙这等胆识之士看到后都微微有点忌惮，便停住了脚步，再次从裤衩里掏出回旋镖来。西蒙停住脚步，那几双红色眼睛也闭合了，窗户里又成了黑色。西蒙继续走，却不和之前那么快，而是缓缓的一点点挪动，回旋镖紧握在手里随时准备战斗。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("西蒙挪到离楼大约五米远时，二楼的几扇窗户里又亮起了鬼眼，瞬间以迅雷不及掩耳之势从窗口里冲了出来朝西蒙袭击，原来出来的是个头和猫狗一般大小的蓝色妖精，虽然没有翅膀却会飞行。西蒙扔出回旋镖，从妖精的脖子处削过，随着一声惨叫，妖精的头和身子分了家，掉落在西蒙脚边。虽然分了家，但尸体的头部嘴巴还妈呀了几下才停止。这时，从三楼、四楼、五楼的窗口里又有好几十只会飞的妖精一起朝西蒙袭击来。西蒙摆出太极手势，回旋镖瞬间变成了十来个，在其身体周围像旋风一样旋转着。妖精们连进来的机会都没有，一冲到旋风周围就和第一只妖精下场一样。紧接着，从二楼到五楼之间的窗口里站满了妖精，有好几百只通红的鬼眼，一起从楼上向西蒙袭击而来，在远处观察的猎户们都吓的差点叫出声来。妖精虽多，但就算成千上万和刚才的数量看上去没区别，碰到旋风表面如同飞蛾扑火，瞬间就呜呼了，只是妖精们的尸体越来越多，在西蒙周围堆成了小山丘，鲜血把周围的土地染成了猩红色，还能闻到一股股浓浓的血腥味。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("西蒙刚要走进楼道，身后尸体堆成的小山丘里突然蹦出来一只浑身血色的妖精，跳到了西蒙的臀部，瞬间扯掉了西蒙的红裤衩。西蒙下面露了出来，上面长了很多阴毛。妖精死死抓住西蒙臀部不放，这个看似一刀就能干掉的小妖力量却不小，西蒙半天都没挣脱开。妖精的魔抓抓在西蒙的阴茎上，看上去想要抓碎他的睾丸。睾丸可是男人的命根，西蒙嘴里念念有词，地上的回旋镖飞了起来，插进了妖精的后背，妖精的手失去了力量，身体从西蒙身上脱落下来。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("西蒙的红裤衩被那只装死的妖精扯碎了一半，再也穿不上了，阴茎上和睾丸周围还受了点小伤，流出了鲜血，感觉火辣辣的。西蒙从一半裤衩上撕了块红布，包扎好伤口止住血。现在即使没裤衩裹着下面也得光着身子继续往前闯关，自己身为男人感觉无所谓，只要把下面保护好别再受伤就行。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("猎户在暗中看到西蒙光着身子走进了黑暗的楼道，想把自己的裤衩脱掉借西蒙穿着，反正自己穿着裤子，不穿裤衩无所谓。但想想觉得不太合适，便随后也跟着进了楼道。");
					sb.append("</div");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("这座楼里的楼道挺奇怪，并不是相连的，而是每层楼道中间都有断裂的一部分。从二楼起，有的地方还有矮墙堵着去路，得翻过去才行。西蒙翻来翻去，感觉阴部的伤口又开始流血了，只好拿扯碎的一半裤衩擦拭着。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("走到最顶楼时，黑暗的楼道里突然出现一个声音：“大哥哥，你的伤口还痛吗？”说着有只小手碰到了西蒙的阴茎上。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“你是谁？”西蒙转过身去掐住那个人的脖子。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“别怕，不要伤害我，我是帮你包扎伤口的。”说着，手电筒亮开了，西蒙看见一个十岁左右的小女孩出现在眼前，戴着眼镜、脚上穿着双绿色的儿童双星球鞋(<a class=\"img_a\" href=\""+CHAP11_IMAGE_PATH+"002.jpg\" target=\"_blank\">图</a>)、套着长筒白袜。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“你要是想伤害我的话请尽快离开，你是女孩我是男人，好男不跟女斗，我可不想伤了你。”西蒙右手掐着小女孩的脖子、左手食指指着她眼镜镜片。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“哥哥放心，妹妹不会伤害哥哥的。哥哥受伤了，怎么还进这危险的地方？妹妹必须给哥哥处理好伤口，不然会感染的。”小女孩看上去特别单纯呆萌，西蒙缓缓的把手从她脖子上松开，还是有几分提防。“哥哥要是信任妹妹的话请跟我来。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("西蒙心里憋了一肚子疑问，小女孩目前看上去倒是真像带着西蒙去处理伤口，西蒙只好先跟着她往走廊另一边走去。楼内异常死寂沉静，刚才西蒙与小女孩的对话在楼道内回荡，几位猎户在二楼就听见了，他们为了不让西蒙发觉，进楼后屏住了呼吸。他们虽然没看到小女孩的长相，觉得她十有八九比较可疑，就一步步悄悄的上了楼跟着他们。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("过了这个楼道，进入另一端走廊时灯亮了。西蒙在灯光的照射下看到小女孩左脚的双星球鞋鞋带开了、脚跟还踩着鞋帮，可能是刚才掐着她脖子时给踩开的，小女孩好像还没有发现。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“小妹妹停停！”西蒙把小女孩叫住。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“哥哥哪里不舒服吗？”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“没有，只是你的鞋带开了，小心绊倒。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("小女孩低头看到后便蹲下，并没有立即系好鞋带，而是脱掉左脚的球鞋，白色长筒袜袜底是灰色的。拿出里面的鞋垫，把球鞋往下卡了卡，一只小强从里面跑了出来。小女孩把鞋垫整理好又放进去，穿上球鞋继续带路往前走。走到走廊尽头的那间房，摸出裤兜里的钥匙打开房门，让身说：“哥哥请进。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("西蒙走进去时回头一直盯着小女孩，见她没有异常举动。小女孩关上了房门上了锁，找了把椅子让西蒙先坐下。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("西蒙打量了四周布局，房子是套一，面积比较狭小，看来只有小女孩自己居住。没有地板，都是水泥地，有一张床、一把椅子（自己坐的这把）、一张很小的桌子，窗户上没有玻璃和窗帘。但令他奇怪的是没有看到卫生间和厨房，哪小女孩的饮食起居是怎么处理的？");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“小妹妹，哥哥冒犯问你几个问题可以吗？”西蒙对小女孩的态度比刚才好多了。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“请问。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“你叫什么名字？这里就你一人住吗？怎么住在这么诡异的地方？你家人呢？”其实西蒙肚子里远不止这几个问题。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("小女孩听到西蒙的问题后，眼里含着泪水，马上就要流出来了。“妹妹先给哥哥处理好伤口再慢慢告诉哥哥可以吗？”小女孩从床底下拿出一个带有红色十字架的盒子，打开后里面有几卷纱布、一瓶碘酒和几根棉棒。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“行，不过要说实话，哥哥可不喜欢撒谎的孩子。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“哥哥把腿分开吧。”小女孩看到西蒙私处裹着红布，周围还有血迹未干，西蒙两腿夹住私处，好像觉得自己是男人，怕被小女孩看到。“不介意的话我就碰碰，虽然咱俩性别不同，但这里就咱俩。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("西蒙犹豫着撇开双腿，小女孩解开了红布，西蒙的私处露了出来，看上去特别肿大，都变的通红了，阴茎上还起了水泡。小女孩从药箱里拿出牙签扎破水泡，抓着西蒙的阴茎把浓水都挤了出来，又拿棉棒沾了碘酒给他涂抹上，包括周围的皮肤都涂抹了一圈，用纱布包扎好。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“今晚已经处理好了，明早咱再换药，哥哥今晚就在这里休息一晚吧。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“多谢妹妹帮助”西蒙抚摸着小女孩头部，“但哥哥还要急着去救人呢。”西蒙看到小女孩的球鞋上有几滴碘酒，还沾着一些灰尘。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“是去西北方的黑风寨救人吗？那里妖怪蛮厉害的，你去了只有一个结果，得先想想办法再说。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“你是怎么知道这些的？”西蒙态度看上去又变了，带着质问语气。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("小女孩眼里又含满泪水，这次流出来了，落在球鞋上。“我的家人就是被那伙强人虏走的，就在一年前，我和家人出来野餐，经过这里，那时这里的景色宜人。我们玩的正嗨，突然间一阵妖风吹过，天昏地暗。家人感觉不妙，把我的嘴堵上，身子捆住，放在了草丛里。他们被一伙妖精抓走了，主要是三位大王和一群喽啰。一位黑袍、一位巨蝎、还有位蜈蚣精。家人被虏走后生死不明，这里就变成了这般景象。不过前一阵子那位黑袍大王被几个英雄合伙剿灭了，他们当中的几位也从这里经过，说是去黑风寨帮我救家人，这一去好几天都没消息。今晚又遇到了哥哥你。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("小女孩说着泪流满面，说话变的哽咽了，泪水顺着脸颊流到衣服上。西蒙这么一听产生了怜悯之心，取消了戒备之心，坐在椅子上伸出手臂搂住小女孩。“对了，刚才我一直叫你妹妹，请问该怎么称呼你？”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“我叫代茜，不过这个名字自从那晚父母被劫走后就再也没有人叫过。”代茜呜咽声减轻了很多。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“哥哥怎么称呼？”代茜问道。“我叫西蒙，叫我大蒙哥就行。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“大蒙哥好！小妹有几样东西要给你。”代茜到床边蹲下身取出一个麻袋，从里面摸出一条白色裤衩、一双白色棉袜、一双黑色沙滩凉鞋、一条黑色长裤、一件短袖白色T恤，把它们放在床上，说：“大蒙哥身为男子汉不能光着身子，起码穿的像样些。”说着让西蒙从椅子上起来，坐在床边，“这些衣物是我爸爸去年旅行时带的，现在只能当作遗物了。我是位女孩子，本来我不想把它们给任何人，但见大蒙哥没衣物穿只好给大蒙哥了。”西蒙坐在床边，代茜见他私处的伤口止住血了，先把白色内裤给他穿上，这样私处就被裹住了。西蒙的表情看上去自然多了，代茜又给他穿上短裤、T恤、棉袜，最后解开沙滩凉鞋的边带，西蒙穿上感觉合适时，代茜把边带贴合上。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“本想给大蒙哥找双运动鞋穿来，但唯一一双运动鞋穿在我爸身上，这双沙滩凉鞋是在宾馆里穿的，大蒙哥不介意的话就凑合着穿吧。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("西蒙以前穿深色袜子比较多，很少穿白袜，现在又穿上沙滩凉鞋，感觉挺合脚，想不到才半小时功夫就从一位光腚猴变成了穿着一身装的俊男(<a class=\"img_a\" href=\""+CHAP11_IMAGE_PATH+"003.png\" target=\"_blank\">图</a>)。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("想到光腚猴，西蒙想起刚才那位给他扯掉裤衩的妖精，便问代茜：“对了，刚才有一群会飞的小妖袭击我，它们不伤害你吗？”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“其实它们是我养的一群鸟，可顽皮了，经常在天上飞来飞去。有次可能飞去了黑风寨附近，中了妖精们的妖法，就从小鸟模样变成了妖精模样，再也变不回来了。其实它们被我驯服了，对我很亲热的，刚才可能见到你觉得陌生，怕是妖精来了伤害它们，就袭击你。实在很抱歉，刚才我躺在床上睡着了，要是我早一步发现会制止它们的，它们都听我的。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("代茜妹妹说着，右脚的球鞋搭在左脚的膝盖上，球鞋的鞋边都掉去了颜色，看上去好像穿好久了。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“等哥哥想办法救出你父母，再给你买双新鞋。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“多谢大蒙哥，这双球鞋我已经穿一年多了，是我的生日礼物，穿习惯了。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“对了，这里有卫生间和厨房吗？”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“抱歉，大蒙哥，这里条件差真没有。平时有需要方便时，我一般都到楼下的草堆里，每天大约去个一两次。大蒙哥要是想方便的话，可以在窗口处进行，小妹不介意，小妹暂时不需要方便。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("西蒙见代茜妹妹不介意，便脱掉刚换的新裤衩，一条银线从五楼窗口洒下去，楼下的草丛里好像有会动的东西，被淋到后溜走了。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“多谢代茜妹妹的帮助，今晚不早了早点休息吧，明天还要救人呢。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“大蒙哥身上有伤能行吗？要不再修养两天再说？”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“也罢，我本想今晚就去救人，但却受伤了。既然代妹这么说，我就在这里休三天再去，到时候你在这里等哥的消息就行，不用去冒险了。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“好的哥，这三天期间由我来照顾你就行。”说着代茜也上了床，“我就是在这里休息的，不介意的话你也睡我旁边吧。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“好吧。”西蒙说时脱掉了凉鞋和白袜，但看到代茜只是摘掉眼镜放在桌上，居然穿着球鞋就上床了，球鞋的鞋底是绿色橡胶底，正好朝下踩在床单上。“代妹怎么不脱鞋？”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“无所谓，妹子一般睡觉都穿着鞋睡，这双球鞋是我的生日礼物，我很喜欢它，怕丢了。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“这样不好，脚上容易滋生细菌得脚苋，还是脱了鞋吧，脚捂一天了也让脚丫出来透透气。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“唉幺大蒙哥还是考虑养好你的伤吧，早点休息吧。”代茜就是不肯脱鞋，把脑袋转向一旁不理西蒙了。西蒙见她这么固执，想假装睡着，等她睡沉时再帮她脱掉球鞋。可西蒙经过几个小时的奔波，已经有了几分睡意，才躺下几分钟就进入了梦乡。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("门外的几个猎户一字不差的听到了刚才两人的对话，觉得这位代茜表面上对西蒙不错，但有几分可疑。门上了锁猎户们无法进入没看到里面具体场景，为了避免悲剧发生，他们几个决定轮流站岗保证屋内西蒙的安全。前半夜一半人站岗另一半休息，后半夜反过来。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("不知过了多久，屋里传来了西蒙打呼噜声。西蒙进入了梦乡，梦见自己穿着白色裤衩走在营救公主的路上。路上有很多高墙，西蒙翻墙过去。白裤衩本来就不耐脏，变成了暗黑色。这还不说，黑里透红。原来伤口又开裂了，血渍染到内裤上了。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“大蒙哥今早怎么忘记换药就走了？也没穿衣服和鞋子”旁边传来代茜妹妹的声音，西蒙看到自己只穿着白裤衩，是昨晚睡觉时本来就穿着没脱。确实不记得今早发生了什么，为何没穿衣服和鞋子就上路了。回过头看到代妹居然裸体而来，手里拿着自己昨晚换上的那身装（白色T恤、黑色长裤、凉鞋、白袜）。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“代妹怎么这样就来了？”西蒙不可思议的问。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“今早醒来时不见大蒙哥，猜想一定是急着赶路忘记穿衣了。我也来不及穿衣就来追赶给你送衣，真的赶上了。赶紧穿上衣服。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“我马上穿”西蒙说，“代妹也赶紧回去穿上衣服，女孩子这样出来多不好。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“好的，不过我回去前得先给大蒙哥换上药，大蒙哥伤口又流血了。”代妹说着从大蒙哥的棉袜里拿出药瓶来准备涂抹。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“我自己来就行，你赶紧回去穿衣，快点！”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“哈哈哈。。。”代茜发出一阵阵狰狞的笑声，“我本来就不需要穿衣啊。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“代妹这话啥意思？是在跟哥开玩笑吗？”西蒙呆滞的问道：");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“等去了那里你马上就会知道的。”代茜语气变的狰狞了，连称呼都没有，直接用第二人称。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“哪里？”西蒙四周张望。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“那里！”代妹指着西蒙身后。西蒙刚回过头就感觉到有只手抓在他的裤衩上，抓住了私处用力捏了下去。“让我送你一程吧！”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“啊。。。不要。。。你究竟是谁？”西蒙发出一声声尖叫，但感觉不到任何痛疼，只感觉到一股股液体如同喷泉般从阴茎里流了出来。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("西蒙双腿一蹬，缓缓的醒了过来。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“我的兄弟做噩梦了吗？”屋里漆黑一片，有个熟悉的声音问道：");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“是的，你是？”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("原来是那几个猎户刚才在屋外听见里面的尖叫声，可能是代茜对西蒙下了毒手，就踹开门冲了进来。西蒙感觉身体除了包扎好的伤口外，其他地方没有异常，只是感觉内裤里黏糊糊的。猎户按下墙上的开关，灯并没有亮，就打开了手电照明。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("西蒙的白色T恤和黑色长裤放在床边、沙滩凉鞋放在床下，里面卷着白色棉袜，这些都在。内裤穿在身上，刚才西蒙由于在梦里受了惊导致遗精，一些白色精液黏在了内裤里。猎户拿着手电照着其他地方，发现代茜不见了。不仅不见了，而且身上的衣物（球鞋、长袜、衣服、裤子、内裤等）都在床上，如同整个人从里面被抽走似的，眼镜还在地上放着。屋里哪里有什么桌子、椅子、灯泡，除了这张床是用石头做的，其他地方都是散落的骷髅，桌子、椅子这些都成了一堆白骨。西蒙穿上衣裤、鞋袜下床，凉鞋露出的白袜脚无意间伸在床底下一小部分，感觉有东西抓住了脚尖。蹲下身掀开床单一看，令他毛骨悚然。床底下昨晚用的药瓶里装的是鲜血，还有一个人头、手、脚部分的白骨，手骨抓着他脚尖微微活动着，头骨的嘴里念道：“替我报仇。。。”床上代茜的绿色双星球鞋、衣服等变成了沾有血渍的人皮，地上的眼镜也变成了蛛网。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("西蒙和几个猎户都觉得在这里不安全，准备撤离。这时，外面响起了喊声：“赶尽杀绝！大小不留！”一把把火箭射了上来，从窗户射了进来。有一只正从西蒙眼前一英寸处擦过，西蒙能略微的感觉到，头发有几根被烧焦了脱落下来。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“跟我走！”西蒙拿出内裤里的长鞭和回旋镖，带着几位猎户从屋里冲了出去。");
					sb.append("</div>");
					sb.append("<div class=\"next_chap_nav_div\">");
						sb.append("西蒙一伙能否安全脱离险境？那位自称“代茜”的女孩究竟是什么身份？请看下回分解！");
					sb.append("</div>");
				sb.append("</div>");
			sb.append("</div>");
		sb.append("</div>");
		
		return sb.toString();
	}

	/**
	 * 获得第12章内容
	 * @return
	 */
	public static String getChapter12() {
		
		StringBuilder sb=new StringBuilder();
		sb.append("<div class=\"main_div\">");
			sb.append("<div class=\"chapter_div\">");
				sb.append("<h1 class=\"title_div\">");
					sb.append(CHAP12_TIT_NAME);
				sb.append("</h1>");
				sb.append("<div class=\"content_div\">");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("西蒙和猎户们刚冲出屋子，屋里就燃起了熊熊大火，不一会就把整个屋子给吞没了。猎户们用猎枪当作棍子、西蒙用长鞭当作防卫武器，拨开从走廊的窗口外射来的箭。他们几位在长廊里穿梭着前行，不一会就走到了五楼的楼梯口处，可楼道里也燃起了熊熊火焰，堵住了出路。猎户们从楼上跳到了四楼，西蒙也跟着跳下去。一层楼比一般的居民楼稍微高点，大约四五米高度。西蒙虽然穿着凉鞋，但跑起来感觉比光脚舒服，着地时感觉脚掌没多大反应。四楼走廊上的高墙已经塌了，这对于他们来说反而是好事，不用翻墙，直接踩着碎石过去就行。他们听到了脚步声，楼外的敌人已经进入了三楼走廊，正往四楼前进，大家一人手里拿着几块碎石当作武器准备战斗。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("敌人终于现身了，有些是只穿裤衩的野人、有些是石头怪、还有些是猫女，野人群里有的和西蒙一样穿着凉鞋袜子，只是袜子的颜色不同，白色、灰色、黑色的都有、也有光脚穿凉鞋的、还有的猎人穿着运动鞋，看上去至少有好几十人。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("猎户们把手里的石头扔向敌人，野人们有的中了石子直接倒地，石头怪中了石子却安然无恙。西蒙扔出回旋镖，但打在石头怪身上却毫发无伤。野人和猫女的的数量在减少，但石头怪一波一波涌上楼来，数量在不断增多，看上去就算走到了楼梯口也被他们堵住了出路下不去。西蒙看了看窗外，现在在四楼，要是跳下去的话，就算不死也会摔伤，照样被火箭射死。就加快速度，一记飞腿踢向石头怪头部。西蒙穿着凉鞋，不敢用脚尖踢，就用鞋底踢在石头怪面部上，但却感觉像踢在大理石上，怪物头部纹丝不动。怪物反而露出了狰狞的笑容，伸出一只手抓住西蒙的脚不放，西蒙感觉脚瞬间像是被钳子夹住了，挣脱不开，麻木失去了知觉了，好像不属于自己的身上一部分似的。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("石头怪顶两个西蒙那么高大，一只手抓着西蒙的脚，另一只手的食指伸进了鞋底和袜底之间扣了扣，闻了闻说：“臭小子，脚上味道不错，这么穿着就来踢我，看来脚很硬啊。”说着拽着西蒙的脚离心式旋转了好几圈，将其扔在墙上，墙瞬间塌了。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("西蒙的后脑勺撞在墙上，起了蘑菇疙瘩，感觉整个世界都在旋转。他努力保持清醒，隐隐看到刚才那只石头怪又朝他走了过来。刚要站起来，突然感觉哪里不对劲，原来右脚凉鞋鞋底刚才被石头怪扣扣的与系带分了家，白袜袜底也染上了血渍。那些血渍并不是自己身上的，原来身上的白色T恤和黑色长裤瞬间变成了血迹斑斑的人皮，脚上哪里穿的是白袜啊，明明是两张人脸上的皮，鞋子也变成了人肉，唯独白裤衩还在。西蒙猜想可能是昨晚那位自称代茜的妖女把床底下的人皮施了法，暂时变成了衣物之类的东西，等到期就变回了原形。可这条白色裤衩为何还是裤衩呢？");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("没等西蒙搞清楚玄机，石头怪又一次抓起了他。这次把手伸进他的裤衩里摸到了私处，西蒙想：“这下完了，他不会是想和梦里那样捏碎我的睾丸吧？我还没结婚就要断子绝孙了。”但石头怪并没有那么做，而是抓着西蒙的阴茎玩来玩去。不久前西蒙刚遗精过，裤衩里的液体还未干，沾到了石头怪的手上。西蒙私处的伤口还未愈合，担心这样被怪物玩来玩去会引发感染，得想办法挣脱。西蒙感觉下面被怪物玩的变直了，和刚才梦里一样，又有一股液体如喷泉般涌了出来。裤衩被怪物脱掉了，液体终于涌出来了，射到了怪物嘴里。石头怪有洁癖似的，表现出呕吐的样子。西蒙两只脚目前是光着的，趁机用另一只未失去知觉的脚踢在石头怪眼睛上。石头怪痛的双手捂着眼睛倒在地上嗷嗷大叫，西蒙终于解脱了，摔在地上摔的不轻。“蹦！”一声，石头怪炸成了一堆泥土。西蒙找到了这些刀枪不入的石头怪的弱点，原来他们的弱点是在眼睛上，只要打瞎任何一只眼睛，整个石头怪不管多么高大都会化作一堆泥土。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("西蒙的意识慢慢清醒了，看到猎户们正与敌人们殊死搏斗，地上躺着很多野人、猫女的尸体，唯独没看到一堆泥土。数了数猎户的数量，少了两位。又仔细打量了四周，看到一位猎户已经牺牲了，尸体躺在野人们的尸体堆里。另一位的尸体没看到，可能是刚才墙壁塌方时掉到楼下去了，估计凶多吉少。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("西蒙从野人的尸体堆里找到一位脚上穿着黑袜凉鞋的，把袜子脱下来穿在自己脚上，把凉鞋扔一边。又找了一位穿白袜运动鞋的，把运动鞋脱下来自己穿上，感觉正合脚。可能是嫌白袜不耐脏，战斗中不方便的缘故。大喊：“打石头怪的眼睛！”“明白！”几个声音接二连三的回答。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("不一会，地上就出现了一堆堆泥土。怪物的数量越来越少，猎户们终于从楼梯口处杀了出去，一直杀到一楼入口处。他们刚要冲出去，被外面枪林弹雨的火箭射了进来。一位猎户腿上还中了一箭，将其拔掉，用猫女的衣带包扎好伤口。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("楼上的火势愈来愈大，一块块碎石从上面掉落下来，险些砸中西蒙右脚。再继续在妖楼里待下去也不是办法，整座楼都摇摇欲坠。西蒙拿出长鞭和回旋镖，说：“我有一个法子，不敢说一定能逃出去，起码可以一试，总比在这里等死好。我马上数到三，大伙一定要紧跟在我身边，明白吗？”“明白！”猎户们一口同声的回答。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“一、二、三！”西蒙扔出回旋镖，扔到楼外，回旋镖分成了若干个，在楼梯口处形成了一道牢不可破的屏障，和昨晚在楼外剿灭妖精的阵势一模一样。西蒙见回旋镖可以挡住火箭的射击，便喊“冲！”在屏障的保护下，猎户们跟在西蒙旁边，就像孙猴子用如意棒在地上画地为牢似的，有了安全感。无数火箭不仅被回旋镖挡住了，而且还射向相反的方向，野人、猫女们纷纷中箭倒地，石头怪有些眼睛也被火箭射瞎，瞬间变成一堆泥土。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("眼看着猎户这边占了上风，妖精们被打的节节败退。突然间西蒙发出一阵尖叫，回旋镖形成的屏障由于一时失去了主人的操控，开始溃不成形。没有了屏障的防御，火箭射进了保护层里，猎户们在用长枪拨开火箭。原来有位猫女会遁甲术，从地里钻进了保护层内，趁西蒙不注意，用一支未点燃的箭刺穿了西蒙的右脚脚底。西蒙的运动鞋鞋底被刺穿了，连同脚背、脚掌、鞋面都被刺穿了。西蒙忍住剧痛，夺过来猫女手中的箭，将其从头颅到肛门穿过，穿成了烤肉串。西蒙意识还清醒，继续操控着回旋镖，保护层再次形成，挡住了外面的火箭。刚才保护层这一阵失控期间，有两位猎户被火箭射中了，一位被射中了肩胛骨、一位被射中了屁股，但都是小伤，他们拔出箭后继续靠着西蒙身边。西蒙的右脚受伤了，运动鞋被刺穿后，鞋底跟鞋帮之间分了家，袜子也不像样了。西蒙脱掉它们光着脚，一瘸一拐踉踉跄跄的行走。但经过刚才的教训，西蒙再也不允许猫女从地下偷袭了，跟回旋镖下了命令，一旦有妖怪从地下偷袭，立刻进攻。回旋镖早就被主人驯服，达到了天人合一境界。有几只猫女再次从地下偷袭，还没露出头来，回旋镖就飞下去扎进土地里，不偏不斜的正中猫女头部。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("猫女从地下袭击却被回旋镖插个正着，死的比在地上更惨。敌人不一会就所剩无几，剩下的几个都四处逃散。西蒙四周打量，见敌人们真的没有了，就收回了回旋镖。为了避免敌人再来时被发现，就和猎户们一起躲在附件的树林里，先休憩一会恢复一下体力。西蒙私处一晚上射了两次，一次是遗精、另一次是手淫造成的。俗话说：十滴血等于一滴精。西蒙感觉跑马(1)跑的加作战，体力透支太大。白裤衩大部分区域都粘上了精液，现在虽然干了，但泛黄了，也没有地方洗涤。见身边都是男人，只好先脱掉内裤，光着身子。脚底被箭扎伤了，从猫女的尸体上解下衣带来包扎好。解下衣带后，猫女的尸体露出了红红的屁股。有位猎户比较好奇，猫女的下面究竟是什么样，就拎起一只撇开它的双腿看了看，看上去和女人下面的构造大差不差。他们感觉昨晚那位叫代茜的女孩也是猫女变的，但她比这群猫女高的多。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("猎户们休憩了一小时左右，感觉体力渐渐恢复了。西蒙穿上裤衩，大家一起继续前行。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("前面有条大河，河水是红色的，冒着热气。对岸离这边大约有好几百米，用肉眼就可以望见对岸是片树林。那边就是黑枫林的深处，很多人就是在那边迷路的。西蒙走到河边，刚要跳下水游到对岸却发现这哪是什么河水，分明是岩浆。有只耗子无意中失足跌落到岩浆里，几秒钟后白骨浮出水面。正当西蒙犯愁如何渡过时，对面飘来了一块和草地差不多，方圆一米左右的东西，可以当作小船带你到对岸。西蒙便跳了上去，那块草地似的小船载着他去往对岸。几位猎户以为还会有其他那种漂浮物来接他们过河，结果只有西蒙坐的那唯一一块而已。西蒙站在漂浮物上，不一会就到了对岸。他告诉猎户们，这里就正式进入迷林了，自己先去探探虚实，一会就回来，让他们在对岸等着。说完便朝树林深处去了，消失在这边岸上几位猎户的视线里。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("漂浮物虽然可以载着他们过河，但行驶速度特别缓慢。来回要十来分钟，比划船都慢，而且载重多了还会往下沉，一次只能载着两人过河。猎户两位两位的坐着它往对岸飘去，途中从岩浆里时不时的泛出一串串红色的水泡，但都是在漂浮物周围半米以外的范围，好像是让着漂浮物似的。终于几位猎户都抵达了对岸，已经过去了将近一小时，还不知道西蒙现在走到哪里，会不会迷路。几位猎户感觉眼皮直跳，有种不详的预感。他们继续穿着盔甲保证自身安全，朝黑枫林深处去了。虽然没有再看见西蒙的身影，不知其身处何处，还好他们穿着盔甲行走，没有再遇到新的麻烦。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("走了一个多时辰，一条大河又出现在他们眼前，原来他们又绕回到了刚才的地方。现在他们有两个选择，要么放弃继续寻找西蒙，坐着漂浮物原路回去；要么想办法继续往前走，走出这片迷林。几位猎户继续缓慢的摸索着前行，感觉一直超前行走，但花了三个多时辰，却迂回了三次都绕回了原地。太阳慢慢的从地平线升起，天快亮了，有位猎户建议先休息一会再想办法，这样继续走下去只能白白的消耗体力。大家认为他说的对，就暂停休憩了。虽然都停下来，但心里还是忐忑不安，担心西蒙出了什么意外，况且他的私处、脚上都还有伤，若真的遇到敌人，恐怕不会那么轻易应对。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("正当大家替西蒙担心时，草丛里有骚动声，猎户们给枪上好子弹准备作战。但出来的不是敌人，而是一只狐狸，嘴里叼着一只死了的猫女的尸体往前跑。狐狸是狡猾的，猎户们觉得跟着狐狸走说不定能发现什么线索。狐狸虽然跑的快，但猎户们的奔跑速度还是追赶的上。跑了一段路，感觉树林的景象不再是周而复始的，而是有座城墙出现在面前。城墙旁边有个洞，狐狸进洞去了。多亏了这只狐狸，不然猎户还真的找不到这里。虽然看到了城堡，但还是没找到西蒙，连个人影和脚印都没看到。说到脚印，猎户们突然间看到地上有一个大脚印，比西蒙的大很多，踩在地上留下了很深的坑。除了大脚印外，旁边还有几个小些的脚印。通过对比，猎户们可以确定这小脚印就是西蒙留下的。能看到脚印却没看到人，西蒙一定是出事了。大脚印像是巨人的，西蒙身上带着伤，只穿着一条白裤衩。要是遇到这么大的巨人肯定对付不了，况且就算他没受伤，遇到这么大的巨人也不一定能应付的了。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("说起裤衩，猎户们顺着脚印方向寻找，看到它到草丛处就不见了，而草丛顶上挂着一件白色东西。猎户走进一看，正是西蒙的白裤衩。裤衩上除了沾着两股已干的黄色液体外，还藏着一张白纸。猎户打开纸一看，上面写着三行字，第一行：“白杨树处往左拐”、第二行：“对着大理石门说‘芝麻开门’”、第三行：“法宝口令‘如意如意、按我心意、快快显灵。’”。除了这张纸和这条裤衩外，猎户还在草丛里找到了西蒙的长鞭和回旋镖，长鞭已经断成了两节，回旋镖的刀刃上也有一道道牙印缺口。糟了，西蒙百分之百出事了，裤衩没了，他肯定是和昨晚走进楼道一样，光着身子。猎户们不管是否能引来敌人，大喊：“西蒙！西蒙！”除了树上的几只鸟飞走外，再别无其他动静。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("猎户们顺着硕大的脚印往前走，离着城墙越来越近。猎户们走到城墙边，城墙足足有十多米高，墙面很厚。刚才那只狐狸从洞里进去的，有位猎户趴下往洞里看，洞的另一边可以依稀看到有座山寨离着城墙大约有二三百米，有些人在里面劳作，看来墙的那边就是黑风寨了。猎户看到距离城墙十多米处有颗比城墙高出好几米的白杨树，便爬到上面往里看，可爬到树顶也看不到墙里面的地面，只能看到远处有座阁楼的最上层有根竖着的烟囱冒着袅袅炊烟，阁楼一共有几层不太清楚。西蒙可能就被关在阁楼里面受苦呢，得想个办法把他救出来。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("那位猎户还趴在洞边观察里面的情景，突然间，看到一双凉鞋白袜脚就站在洞的那边，一只手放在袜尖处，另一只手在拔草。猎户伸过手去碰了碰那边的白袜脚，那边响起了尖叫声“啊！见鬼了！”听说话的声音是女孩。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“别怕，小妹妹，哥不会伤害你的，只是想了解些事。”猎户把手伸了回来。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“什么事？”那边的人跪下来把头也伸到了洞里，看到了猎户脸庞。果然那边的人是位十五岁左右的少女，看上去怯生生的样子。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“请问有没有看到过一位男子被抓来你们院里？可能光着身子。”为了问清楚实情，猎户不得不当着女孩面直截了当的问。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“有啊，大约半个小时前，这里的门卫手里拎着一位男子去山寨了，男子身上没穿任何东西，处于昏迷状态。我们的寨主便拿着葫芦把他收了进去。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“啊？”有位猎户听到少女说到寨主的葫芦能收人，就像金角大王(1)的法宝一样，便不寒而栗。“那该如何克制这种法宝？”又有一位猎户问少女。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“这个还真不晓得，那葫芦原来是只普通的葫芦而已，是我的生日礼物，是我爸从田地里摘的。这种葫芦老人们都称它‘地包天’，听说有种法术可以让它变成如意法宝，但就连祖先都没琢磨透。在我五岁生日那晚，来了只蝎子精，把我连同那只葫芦一起捉走了。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“那臭蝎子是如何掌握法术把葫芦变成法宝的？”猎户不解的问。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“这我就不知道了，反正我被抓到这里来后一直被关，就算出了这座高墙，外面的黑枫林是迷林，绕来绕去就是出不去，无法找到回家路，这一过就是十年。我被刚抓来时连鞋子都没得穿，就在去年有位贩子送我这双凉鞋和棉袜，我才能大方的行走。”少女从洞口把穿着凉鞋白袜的脚伸出去给猎户瞧了瞧。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("原来这位少女就是那位杨兰春，现在已经十五岁了。刚被抓来时经常看到巨蝎拿着那只普通的葫芦在手里玩来玩去，每天早出晚归，离开了山寨不知去了哪。过了大约一个月左右，她便得意洋洋的拿着葫芦回来了。当时山寨的大王是黑袍，见到巨蝎连看一眼都不看，便说：“你还回来干嘛？这里有蜈蚣陪我就够了，你来只能碍眼。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“我今天是专门来收拾你的。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“就凭你？得了吧，谁收拾谁啊？”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“就凭这个玩意。”巨蝎拿着手中的宝葫芦威胁道：“识相的话就老实些乖乖听我的吩咐。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“这破玩意你拿着它很久了，有啥稀罕的？白送我都不要呢。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("巨蝎把宝葫芦对着黑袍，嘴里念念有词，瞬间就刮起了一阵疾风，将黑袍吸了进去。旁边的蜈蚣精吓得退缩到一边，巨蝎又拿着宝葫芦念了几句，一股股寒风把蜈蚣精团团围住。不一会功夫，蜈蚣精就被冻在了冰块里，冰块比石头都坚硬。蜈蚣精在里面睁着眼，像标本一样动弹不得。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“哈哈，从今往后这里我是大王了！”巨蝎发出一阵阵狰狞的笑声。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("杨兰春隔着墙给猎户讲了这一幕幕回忆。“那后来黑袍和蜈蚣怎样了？”一位猎户追问：");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“被巨蝎大王驯服后放了出来，成了她的奴隶。现在还不是说这些的时候，我是偷着方便便来这里的，不宜久留以免被发现。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“对了，这张纸上会不会是记着宝葫芦的什么秘诀呢？”猎户想把西蒙裤衩里的那张纸递到了兰春手里，却发现西蒙的白色裤衩不知什么时候居然变成了骷髅，白纸被骷髅咬在嘴里。猎户拿枪杆砸碎了骷髅，白纸掉了出来，已经残碎不全，但还能勉强拼凑起来。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("兰春看了看那几行字，说：“白杨树处往左拐可能是如何走出迷林的走法、大理石门可能是前面那扇大门、最后一句可能是宝葫芦的口令，不过葫芦一直在巨蝎手里，我没试过。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“我倒是到处找不到你，臭丫头原来躲在这里。”墙的另一边有个尖锐的声音说道。兰春用脚把碎纸踢到了洞里，几秒后那个人来到了兰春身边，变成了一只蜈蚣，钻进兰春凉鞋和棉袜之间，又钻进了兰春的裤裆里。从头到脚缠住了兰春，将其拽了回去。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("幸好猎户们刚才退到了墙边没被蜈蚣精发现，猎户们在蜈蚣精走远后，顺着兰春说的方向走了一段距离，果然，有个五六米高的大理石门出现在眼前。猎户对着大门念道：“芝麻开门！”大理石门缓缓的打开了，猎户们看到了院子里面的景象。院子里长着很多蘑菇，冒着黑烟，看上去是毒蘑菇。远处的阁楼一共有三层，每层五六米高，从窗口上可以看到很多妇女老少被困在里面不得脱身，在里面当苦力。“芝麻关门！”大门又闭合了。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("猎户们已经来到黑风寨边缘了，觉得凭目前的实力不敢再继续前进了，便商量好先回去商议一下，再想对策救出兰春和西蒙。");
					sb.append("</div>");
					sb.append("<div class=\"next_chap_nav_div\">");
						sb.append("猎户们到底能否救出兰春和西蒙？请看下回分解！");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("");
					sb.append("</div>");
					sb.append("");
					sb.append("");
					sb.append("");
					sb.append("");
					sb.append("");
					sb.append("");
					sb.append("");
					sb.append("");
					sb.append("");
					sb.append("");
					sb.append("");
					sb.append("");
					sb.append("");
					sb.append("一个女人姓张名萌，一个男人姓李名龙。李龙的家庭是个惨不忍堵的家庭，自从张萌和李龙结婚后，张萌的命运被李龙的家庭给改变了，一场爱与恨的故事就此拉开帷幕。");
					sb.append("本故事要先从张萌的母亲乔梅花讲起……");
					sb.append("乔梅花1931年出生于东北松花江，后来搬到山东省高密县的一个小山村里，从小在那里长大。全家五口，排行老三。父亲乔大山、母亲崔孟华、大哥乔天赐、二哥乔少康。大山与孟华原居东北松花江，1931年九一八事变爆发，全家被迫逃亡，来到高密县。");
					sb.append("乔梅花五岁那年（1936年12月），西安事变爆发，乔大山加入抗日游击队去绥远前线支援。37年春，在反“右”运动中被队伍里的奸细（卖国贼）出卖，被俘，惨遭绞刑。全家人得知消息深恶痛疾。");
					sb.append("1937年，抗日战争全面爆发，战争硝烟笼罩中华大地，全国人民陷入水深火热中。");
					sb.append("那年乔梅花才六岁就进了私塾，学校地理位置偏僻，与家之间隔了一座大山。乔梅花每天五点起床，晚上七点才能回家。她在校期间成绩每次都能考进年级前五名，而少康却不务正业，经常逃学。乔天赐为了养家糊口，给妹妹筹学费，读完小学就退学在家耕地，卖粮食挣钱。每当耕田疲惫时，时常哼着《在希望的田野上》来提神。");
					sb.append("1943年夏天，鬼子进村扫荡，全村人逃之夭夭。天赐事先向八路军报了信，正要带着家人逃亡，唯独不见少康，天赐料知少康在赌场赌博，要去通知弟弟，崔孟华告诉儿子来不及了。尽管兄弟之前有许多过解，可天赐却不愿出卖手足之情。鬼子以迅雷不及掩耳的速度来到村口，孟华母女正担心天赐的安全，天赐拉着二哥少康在村头飞速朝母女两跑来，后头洋鬼子正穷追不舍。一群洋鬼子用枪瞄准兄弟两，孟华大喊：“天赐、少康，危险！”母亲说话前天赐早就料到下一秒会发生什么事，一把将弟弟拉到前头，用自己的身躯保护好少康。话音刚落，只听“呯……呯……呯……呯”子弹打穿了天赐，天赐依然不肯倒下，尽力将弟弟推到家人身边。螳螂捕蝉黄雀在后，这时，八路军在洋鬼子们身后开枪，消灭了全部敌人。");
					sb.append("第一章         完");
					sb.append("");
					sb.append("");
					sb.append("");
					sb.append("");
				sb.append("</div>");
			sb.append("</div>");
		sb.append("</div>");
		
		return sb.toString();
	}
}
