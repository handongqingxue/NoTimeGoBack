package com.noTimeGoBack.util;

public class Part1Util {
	
	/**
	 * 第1章标题
	 */
	public static final String CHAP1_TIT_NAME="第1章 旱灾";
	/**
	 * 第2章标题
	 */
	public static final String CHAP2_TIT_NAME="第2章 列车上的小偷";
	/**
	 * 第3章标题
	 */
	public static final String CHAP3_TIT_NAME="第3章 帮手";
	/**
	 * 第4章标题
	 */
	public static final String CHAP4_TIT_NAME="第4章 山本与浅见";
	/**
	 * 第5章标题
	 */
	public static final String CHAP5_TIT_NAME="第5章 城南叙旧";
	/**
	 * 第6章标题
	 */
	public static final String CHAP6_TIT_NAME="第6章 药勺村的故事";
	/**
	 * 第7章标题
	 */
	public static final String CHAP7_TIT_NAME="第7章 黑枫林";
	/**
	 * 第8章标题
	 */
	public static final String CHAP8_TIT_NAME="第8章 天人三问";
	/**
	 * 第9章标题
	 */
	public static final String CHAP9_TIT_NAME="第9章 达摩祖师";
	/**
	 * 第10章标题
	 */
	public static final String CHAP10_TIT_NAME="第10章 黑风老妖";
	/**
	 * 第11章标题
	 */
	public static final String CHAP11_TIT_NAME="第11章 智取黑风寨";
	
	public static final String CHAP1_IMAGE_PATH=Contant.IMAGE_PATH+"001";
	public static final String CHAP2_IMAGE_PATH=Contant.IMAGE_PATH+"002";
	public static final String CHAP3_IMAGE_PATH=Contant.IMAGE_PATH+"003";
	public static final String CHAP5_IMAGE_PATH=Contant.IMAGE_PATH+"005";
	public static final String CHAP6_IMAGE_PATH=Contant.IMAGE_PATH+"006";
	
	public static String getChapterByNum(int num) {
		String content=null;
		switch (num) {
		case 1:
			content=getChapter1();
			break;
		case 2:
			content=getChapter2();
			break;
		case 3:
			content=getChapter3();
			break;
		case 4:
			content=getChapter4();
			break;
		case 5:
			content=getChapter5();
			break;
		case 6:
			content=getChapter6();
			break;
		case 7:
			content=getChapter7();
			break;
		case 8:
			content=getChapter8();
			break;
		case 9:
			content=getChapter9();
			break;
		case 10:
			content=getChapter10();
			break;
		}
		return content;
	}

	/**
	 * 获得第一章内容
	 * @return
	 */
	public static String getChapter1() {
		
		StringBuilder sb=new StringBuilder();
		sb.append("<div class=\"main_div\">");
			sb.append("<div class=\"chapter_div\">");
				sb.append("<h1 class=\"title_div\">");
					sb.append(CHAP1_TIT_NAME);
				sb.append("</h1>");
				sb.append("<div class=\"content_div\">");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("每个人的一生都不是一帆风顺的，充满着喜怒哀乐、酸甜苦辣、悲欢离合、阴晴圆缺。冯小刚在《童梦奇缘》电影里说过的那句经典台词:“生命是一个存在的过程，可悲的是它不能重来，可喜的是它不需要重来。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("当你怨天尤人说上帝把你安排在一个错误的环境里，是否曾想过还有诸多比你处境更加糟糕的强者？上帝既然会给你关上门，同样也会为你打开窗。本书围绕这一结论讲述了故事《没有岁月可回头》。故事为何叫这个名字呢？这个问题现在说有点过早，需要广大读者用心品读，到时候自然不言而喻。让我们看看故事的究竟吧。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("自1854年鸦片战争起，满清政府开始一步步成为列强统治中国的工具，随着中国的领土、领海、司法、关税和贸易主权开始遭到严重破坏，中国逐渐由一个独立自主的国家沦为半殖民地半封建国家。半个世纪后，孙中山领导了辛亥革命，建立了中华民国。但劳动果实被袁世凯夺取了，中国依然处于半殖民地半封建社会。在这种社会背景下，四万万同胞依然日出而作、日落而息的艰苦奋斗。故事要从山东高密县的一座村庄里讲起。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("烈日炎炎的夏天，农民们在一幕幕方田里星罗棋布，面朝黄土地背朝天的农耕。有位少女约摸二十岁左右，头戴蓑笠帽、身穿衬衫、短裤、脚穿沙滩凉鞋和白色尼龙袜(<a class=\"img_a\" href=\""+CHAP1_IMAGE_PATH+"001.jpg\" target=\"_blank\">图</a>)，在收老玉米。边收边念念有词的哼唱着《在希望的田野上》(1)，手推车里一颗颗金黄色的玉米渐渐堆成小山。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("过了大约一个时辰，手推车里老玉米差不多快装满了，少女便推车朝东南方的田地去。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("东南方的田地里有位男子看上去比那位少女大几岁的样子，也在收老玉米。推车里的玉米数看上去比少女的少一些，可能是因为刚才他与人家闲聊的缘故。少女推车朝男子这边来，离着有十来米左右，男子就开口道：“志华！我的好妹子，想不到这一会功夫你干活还挺快的，真是巾帼不让须眉啊！”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("少女道：“我的志雄哥，什么一会功夫，都过去大半天了，你得抓紧收了。咱一会还得去离村好几里的集市把“宝贝”(2)卖掉，要是完不成任务，回去没法跟咱妈交代。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("男子忙手忙脚的继续收，把推车里剩余的位置也填满了。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“咱二弟哪去了？”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“没看到啊，今早起来就没见志伟。有好几次我见他跟酒鬼们彪在一起，我猜十有八九又去找混混去了”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“要是玩上瘾欠下赌债咱可还不起，咱俩都没告诉咱妈，到时候真的出事就不好交代了。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“我说他好几次了，他就是屡教不改，这次我得好好说说他。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("这位少女姓崔名志华、那位男子是她大哥，名志雄、他们提到的二弟名志伟。他们三人的父亲早在几年前就去世了，自崔父去世后崔母一直有病在身，家里靠志华和志雄哥妹俩种地卖玉米维持。二弟志伟却不务正业，经常和混混们彪一起酗酒、赌博，好几次欠下赌债。还好数目不多，都是哥妹俩用卖玉米赚来的钱给还清的。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("黄昏时分，志雄、志华哥妹俩推着空空的推车回到家。崔母躺在病床上一直咳嗽，听到了二人的脚步声起了三分精神头。哥妹俩报喜道两车玉米统统都卖光了，把赚来的钱放到了抽屉里。崔母两只胳膊分别搂着两位孩子的脖子，欣慰道：“我的好孩子，要是志伟有你们一半听话，我这个当娘的就省心了。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("志雄安慰道：“娘，我们俩虽然没受过高等教育，但已经学会自己做生意赚钱了，相信往后几年咱家的光景会愈来愈好！”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("崔母听到大儿子这番话，瞬间热泪盈眶。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("半夜三更，志伟总算回来了，脚步踉踉跄跄、满身酒气。崔母在屋里睡着了，志雄给二弟开的门。志雄责骂道：“你这个不争气的就做这营生一个顶俩！”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("志伟却不以为然：“我这几次只喝酒不赌博，我发誓，以后要是再赌博，这两只手就不要了。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("志伟后面几次虽然和喽啰们鬼混，但也确认没赌博，没惹出什么大事，只是对家事不闻不问罢了。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("哥妹俩说过家里的光景会越发越好，但天有不测风云，从次年起山东地区屡年闹旱灾，原先肥沃的田地现在变成了不毛之地，很多村民被迫迁居。与此同时，崔母的病情愈发加重。原先只是咳嗽几声，现在滴水不进。二弟还是原来的德行，志雄、志华感觉家庭胆子日益加重，不卖玉米改为卖鲶鱼。一大早到村头的塘渠里网鱼，但网到的数量很少，收入远不如以前卖玉米的多，有些天鱼鹰都不下水。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("有天崔母让哥妹俩想办法把志伟也找来，有要紧事要交代。孩子三总算到齐了，崔母语气微弱的说：“你们都是我的好孩子，我的身体我心里有数。志雄，你把这房子卖给隔壁的虾姑(3)，会赚来些钱。志雄，你是老大，好好给二弟、三妹分配那些钱，去松花江(4)那边找你爹的大哥吧，他们家在那里生活很多年了，看了我写的这封信面上会收留你们的。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("崔母把枕头底下的一封信递给了志雄，继续说：“志雄、志华你们都懂事，我不担心。志伟不学无术，路上不要惹是生非。你们哥妹俩好好保护他，不要让娘在天上也不安息。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("志伟平日虽不务正业，但听了母亲这番话也落泪了，便答：“孩儿谨遵娘的话！”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("志雄说：“娘会好起来的，会没事的。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("崔母脸上刚露出一丝微笑，便一命呜呼。三个孩子彻底成了孤儿，痛苦不止。一起抬着母亲的遗体，到离村头的溏渠不远处找了块空地上下葬了。随后把母亲生前住过的房子卖给了虾姑，拿着赚来的钱，根据信上的地址踏上了新征途。");
					sb.append("</div>");
					sb.append("<div class=\"next_chap_nav_div\">");
						sb.append("三个孩子在去松花江的路上会遇到什么事？请看下回分解。");
					sb.append("</div>");
					sb.append("<div>");
						sb.append("(1)这首歌是解放后期才发行的，这里为了烘托农民艰苦劳作的精神特意穿插进来，望读者不要介意。");
					sb.append("</div>");
					sb.append("<div>");
						sb.append("(2)指玉米。");
					sb.append("</div>");
					sb.append("<div>");
						sb.append("(3)村民都这么称呼她，真实姓名不提。");
					sb.append("</div>");
					sb.append("<div>");
						sb.append("(4)位于东北地区，黑龙江（阿穆尔河）右岸的最大支流，也是中国内河中仅次于长江、黄河而居第三位的大河。");
					sb.append("</div>");
				sb.append("</div>");
			sb.append("</div>");
		sb.append("</div>");
		
		return sb.toString();
	}

	/**
	 * 获得第二章内容
	 * @return
	 */
	public static String getChapter2() {

		StringBuilder sb=new StringBuilder();
		sb.append("<div class=\"main_div\">");
			sb.append("<div class=\"chapter_div\">");
				sb.append("<h1 class=\"title_div\">");
					sb.append(CHAP2_TIT_NAME);
				sb.append("</h1>");
				sb.append("<div class=\"content_div\">");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("崔家的毛坯房是三十多年前崔母、崔父二人在县里靠种地攒下来的血汗钱买下来的，起初夫妻两在不远处租赁了一间茅屋，买下那套房后才搬过来的。这套房在崔父在世时每逢雨季期间经常漏雨，崔父生前在村里的人脉不错，帮助过好几位邻居，不贪恋。在志华才几岁时，有次村里举办抽奖活动，牛村长（大家称他“阿牛”）有事，劳驾崔父替他抓阄。崔父第一个阄就替阿牛抓了，自己随后才抓的。或许是崔父积善成德，手上也沾满财运，一抓就是特等奖，一辆老爷车。再看看自己的阄，上面写着“谢谢参与”四个字。崔母和三个孩子见阿牛不在现场，都建议他把阄一换蒙混过关。阿牛本来就是位富二代，继承父业家里已经有好几辆车了，也不差这一辆。但崔父却墨守成规的等阿牛回来把领来的车物归原主，阿牛为表谢意送崔父一盒雪茄。崔父注重养身从不吸烟，连烟斗都没碰过，便婉言谢绝。阿牛再三感谢崔父，觉得他为人耿直值得交往。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("往后几年里，山东地区夏季经常多雨，好几次崔家老宅漏雨都是村长阿牛找人帮忙修理的。崔父临走前步履蹒跚，好几次家里有事也是阿牛帮忙代办，包括崔父去世后，崔母体弱多病需要帮助时。崔母走后，三位孩子踏上了征途，全村人都来为他们送行，送给三位孩子一些盘缠。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("松花江离高密县有好几千里路，要是步行不知猴年马月才能到，好比西天取经，路上不定遇到“魑魅魍魉(1)”。在高密县内还好说，出了县身为孩子人生地不熟很是为难。经商议，三人决定坐火车去。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("虽然坐火车快的多，但三人来到火车站看了站牌瞬间愣住了，遇到两大难题。其一：没有直达松花江的列车，只能先到北平城南站再转车去；其二：就算到了松花江，找姑父的住址也是大难题。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("志华走着走着感觉脚酸，虽然经常种地、卖粮食，但走这么远的路以前还真的很少经历。志华低头看到脚上原先雪白色的尼龙袜现在有些泛黄了，脱掉凉鞋看到袜跟处露出了脚后跟、袜尖处露着大拇指，凉鞋鞋底也开裂了。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("志华是位爱干净的女孩，之前每天回家都洗洗，晾干后第二天继续穿，一直保持着雪白色，现在却洗不回原来的样子。志华又估计颜面，马上要上火车了，穿着破烂的凉鞋，白里泛黄的尼龙袜两头破了露在外面会遭人耻笑。就找个拐角处，脱掉凉鞋和尼龙袜扔掉，换上临走前乡亲送她的黑色一字带鞋和白色棉袜(<a class=\"img_a\" href=\""+CHAP2_IMAGE_PATH+"001.png\" target=\"_blank\">图</a>)，这样看上去倒像位要好的大姑娘。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("三人只能摸着石头过河，志雄再三叮嘱志伟，路上一定要听从他的安排，决不能制造事端。随着一声声呜呜的汽笛声，列车冒着滚滚浓烟，终于徐徐的朝站台驶来。三人抬着沉重的行李上车，各自找了空位就座。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("车厢内人群比较拥挤，志华、志伟坐在一起，志雄单独坐在离他两只有两座的地方。有位中年男子蹭蹭的朝志华座位走来，手里抱着狗汪汪叫。志华生来怕狗，加上听到了犬吠声，坐的更不安稳。志雄看出了端倪，示意志华过来到自己的座位，自己去和二弟坐在一起。志雄在过道里走着，从某座位上伸出一条腿来将其绊了个正着，正巧倒在一位女子身上。那位女子就碰瓷说他非礼她。志雄身后突然出现一位男子，大骂：“反了！光天化日下敢调戏良家妇女！”骂完朝志雄胸口就是一拳，志雄后背朝后倒在那位抱狗男子的身上。那位男子一把推开志雄，往车门方向跑了。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("当局者迷旁观者清，刚才发生的一幕幕被志华看在眼里，但她是女子，又插不上手。志华总感觉有猫腻，事情不会这么巧。突然看到那位抱狗的男子准备下车了，手里拿着大哥的钱包。大喊：“有贼！”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("志雄摸了摸裤兜才发现钱包不见了，里面装着卖掉崔宅赚来的全部积蓄。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("原来那三人是一伙的，抱狗男子在刚才志华换鞋时已经盯上了他们。做贼做惯了，从志华扔掉的鞋袜来看，他们的处境很潦倒。又见志华换上新鞋新袜，猜想他们身上肯定有一笔钱，要是偷来够花一段时间的，便联手演了刚才那出戏。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("志伟二话不说，立马冲下列车，朝小偷追了过去。志雄见积蓄被偷、二弟也追小偷了。钱倒是次要的，唯恐弟弟有闪失，也跟着追下车。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("车子渐渐的开了，慢慢的驶出站台，志华还在车厢里看守着他们的行李，哥弟两又不知去向。志华以前和大哥做过很多次买卖，到不在话下。但这种局面生平真是头次经历，不知所措，不敢想象接下来等着她的会是啥？只能摸着石头过河。不过有点小小的主意，既然三人起初说好了在北平城南站转车，相信等车到了那在那等着哥弟两就是，志伟的脑子不敢说，但志雄一定也会想到去那里等着妹妹的，这是不二法门。");
					sb.append("</div>");
					sb.append("<div class=\"next_chap_nav_div\">");
						sb.append("哥弟两能否再找到找到妹妹？志华接下来会遇到什么事？请看下回分解。");
					sb.append("</div>");
				sb.append("</div>");
			sb.append("</div>");
		sb.append("</div>");
		
		return sb.toString();
	}

	/**
	 * 获得第三章内容
	 * @return
	 */
	public static String getChapter3() {
		
		StringBuilder sb=new StringBuilder();
		sb.append("<div class=\"main_div\">");
			sb.append("<div class=\"chapter_div\">");
				sb.append("<h1 class=\"title_div\">");
					sb.append(CHAP3_TIT_NAME);
				sb.append("</h1>");
				sb.append("<div class=\"content_div\">");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("虽然征途刚开始三位孩子就遇到了前所未有的遭遇，但过去的几个小时里志华倒是没遇到什么麻烦。目前令她不安的是，等到站后是否能顺利找到走散的两位哥哥。行李箱在她自己身边，但身上除了大哥分的一小部分钱外，其他积蓄都在大哥身上。刚才又被小偷偷走了，两位哥哥现在是否抓到小偷还是未知数。两位哥哥虽比自己大，但未到三十而立的年龄。面对刚才那伙江湖老手，能否应对的了？积蓄倒是次要的，哥哥们的人身安全才是令当妹妹牵挂的。要是哥哥追回了那些积蓄最好，假如没有追回，兄妹三卖艺赚钱也行，无非就是晚几天到舅舅那里罢了。往最坏的想，万一哥哥为了追钱受伤了，得花钱求医。钱还没回来，带着伤可如何是好？");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("志华这几个小时来没心思想怎么顺利抵达舅舅那边，满脑子都是刚才预料的那几种情况。往最坏的地方想，往最好的地方筹划，却百思不得其解。仿佛思维与世隔绝了，漫无目的的游荡在另一个世界里。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("早上赶路虽然着急点，兄妹三人却如胶似漆，阳光明媚、万里晴空。而现在窗外的天气仿佛通晓兄妹的遭遇，也随之变的阴沉沉的，异常死寂。志华感觉到七月流火的天有些沉闷，满脑子想入非非，早已忘却了窗外世界的变化。连中途经过哪些站都顾不得听，只有“北平”二字。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("时间已是黄昏时分，列车出了山东境外，到了河北一代。夏天按理说天长，不至于这么早太阳公公就落山，窗外却变的像夜晚似的黑黝黝的。几分钟后，窗外出现了一条条“银线”，打在车窗上一个点一个点的。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("山东境内最近一年来一直很少下过雨，庄稼枯死的成片。荷塘的水位也逐年降低，有些甚至干涸了，渔船都搁浅在里面。河北虽与山东接壤，气候却与之大不相同，连年多雨。有些山东境内的村民听说这种自然现象，便争先恐后的来到河北境内谋生。但结果却不尽人意，甚至还比不上留在山东。河北范围降的是酸雨，把庄稼都腐蚀了，和山东那边的不毛之地没啥区别。有些体质差的因水土不服生了些罕见病，病死的也有。还有些信佛的找风水先生占卜，烧香祈祷也无济于事。山东与河北之间真是一座围城，攻城的想进城、守城的想出城，却进退维谷。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("雨越下越大，由毛毛雨变成了滂沱大雨，就像要淹没整座城市似的。志华在想两位哥哥现在是在大街上淋雨呢，还是又乘上了列车？乘上列车的可能性不大，因为从高密发往北平的列车今天这是唯一的一班，被他们俩错过了。除非两人坐其他班列车，再转车去北平。可其他班列车还有哪班可以转车到北平呢？志华没从想过。另一种情况更糟糕，还没坐上列车，在大街上淋雨。因为雨伞虽然带了三把，都在志华身边的行李箱内。要是两位哥哥依然在大街上，只有唯一的结果——淋雨。除非他们躲在某个角落避雨，但雨一直下，就没有停的意思，两人真的躲着不知要躲多久？一直躲下去，等志华下车后更不可能见到哥弟了。不管他俩处于哪种情况都好不到哪去，同样很糟。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("列车进入了北平境内，再过不到半小时就要到站了。志华突然间感觉到浑身冰冷，触摸额头上又感觉热乎乎的。从一大早到现在一直未合过眼，想找个地方躺下睡一觉，却又睡不着。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("列车的行驶速度开始放缓，几分钟后渐渐的停下来，列车员报站：“北平南站到了，下车乘客请拿好随身行李，路上注意安全。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("下客门一开，一股冷风瞬间扑身而来。志华瞬间感觉浑身上下起了鸡皮疙瘩，直打哆嗦，好像牙齿要把舌头咬断似的。一直这样待下去也不是办法，再不下车列车马上就要继续开往下一站了，积蓄还不在身上，离开北平站就更无法与哥弟见面了。为了不犯今早那种错误，不引起其他人的怀疑，志华不得不强迫自己下车。便从包里抽出一把折叠伞撑开，另一只手拎着两大包行李下了车。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("穿着一字鞋和白色棉袜的脚刚踏上站台，就感觉到水深起码有十厘米以上，鞋里都被雨水浸透了，都淹没到脚脖处，志华一步步艰难的往前走。北平南站这么大，走的太远等两位哥哥到站后就找不到妹妹了，留在这里又无处安身，还得感受冻饿之虞。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("志华来回徘徊了十来分钟，一时萌生了个念头：“两位哥哥今晚是不可能到这里了，不如先找家客栈吃顿美食，住上一宿。等明天早上说不定雨就停了，到时候再来这里徘徊着，等两位哥哥出现。就算明早雨还下个不停，两位哥哥到站后以大哥的智慧也会想到妹妹不会走远的，肯定会和自己现在一样在周围徘徊寻找。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("正当志华要动身时，旁边出现一位男子，问：“小姐刚到站，住旅馆吗？我们这里的旅馆房价很便宜。”志华现在感觉浑身不舒服，正想找个地方歇息。听男子说了价格，便干脆了当的答应下来，男子带着她走了。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("两人走了有十多分钟，志华问：“先生，怎么还没到？”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“快了，就在前面不远处。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("走着走着，志华感觉身边的人烟变的稀少，走进了胡同，有种不祥的预感，便告诉男子自己想方便一下再走。刚要去，男子拉着她胳膊，说：“走，坚持会，到了住处再方便，女孩子家在这里方便不太合适。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("志华这才感觉不妙，大喊：“救命！”刚喊完一声，就被男子捂着嘴，再也叫不出来了。男子掐着她脖子，将其按在土墙上，志华手里的行李脱手而出。在这之前志华就感觉饥饿，浑身乏力，现在又受到了惊吓，感觉眼前一黑，昏了过去。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("不知过了几时，雨淅沥沥的下着，崔家兄妹三在泥泞的道路上走着，各撑着油纸伞。志华脚上穿着凉鞋和白色尼龙袜，袜底不仅泛黄还磨破了洞、被雨水浸透了，鞋底还开胶了。志雄去站台买火车票,刚掏出钱包就被强盗夺走了。志雄马不停蹄的追赶着，志伟也紧随其后，抛下志华自己。为了不和哥哥们走散，志华穿着不像样的鞋袜凑合着追赶，但毕竟是女孩子，远被甩在后面十多米远。路面的积水很深，有处开着的古力盖没看见，强盗跑着跑着掉了进去。这下好，三人的全部积蓄都打水漂了。这时，旁边驶来了列车，正是去北平的那班。两位哥哥跑在前头，一跳跳到了中间车厢上。妹妹落后了好几十米，离最后一节车厢还差好几米却怎么也追不上。两位哥哥在车厢上为妹妹加油，妹妹跑着跑着，凉鞋的带断了，整个袜底都磨破了，栽倒在地，望着远去的列车却不知所措。地面的雨水突然间升高了，志华整个人都浸入水里，感觉不能呼吸了，呜咽着好像身体沉入了海底，失去了行动能力。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“啊。。。啊。。。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“太好了！我的好妹子醒了！”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("随着耳边一声声呼唤，志华缓缓的睁开眼睛，视线在灯光下慢慢清晰了。原来刚才是一场梦，自己躺在床上。旁边坐着一位少年，看上去年龄和自己差不太多。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“你是谁？我怎么会在这里？”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“我是乔大山，叫我大山哥好了。你已经昏迷好几个小时了，之前你被强盗劫持了，我听到了喊声就冲了过来，看到他掐着你的脖子。那家伙还想进攻我，幸好我受过特训，被我教训了一顿落荒而逃。为了保证妹子安全，哥就没追他。要不是为了你，那狗东西逃不出我的掌心，我一定把他送到义父那里去关上几天。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“多谢大山哥的相救，不然妹子就体无完肤了。哎呀！我的行李呢？那还有我的两个哥哥的行李啊。。。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“妹子放心，一共两个包是不是？都完好无损，只是被雨水浸湿了，在墙角的暖炉边烘干呢。”大山指了指墙角那边，志华看到除了两包行李外，还有自己的一字带鞋和袜子都放在那里烘干着，这才踏实。墙角除了自己的鞋袜外，还烘着一双vans一脚蹬黑色帆布鞋(1)，鞋底是黄色花纹(<a class=\"img_a\" href=\""+CHAP3_IMAGE_PATH+"001.jpg\" target=\"_blank\">图</a>)样式的，和一双白色棉袜。低头看到大山哥脚上穿着拖鞋和白色棉袜，袜筒上带着nike商标(2)。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("志华在列车上坐了一下午一直没去方便过，几小时昏迷前就有尿意。现在苏醒过来，感觉尿意加重了，问大山哥茅厕位置，要自己下床去小解。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“要去小解？好说，刚醒不用下床，等我会。”大山去角落里拿来痰盂“不介意的话尿这里面吧。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“好的。”志华自己脱掉半截裤子，大山把头转向一边看着自己那双vans一脚蹬帆布鞋，已经差不多好烘干了。只听到一阵哗啦啦的流水声，持续了大约一分钟左右。痰盂里盛了一多半橙黄色液体，大山去了屋外的茅厕将其倒掉，回到屋里的水龙头处，把痰盂刷了一遍，放在床边。“想方便的话随时叫我。妹子想喝水了吧？我去熬粥。”志华点点头。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("过了大约半个小时，大山端来一碗热乎乎的八宝粥。舀了一勺放嘴边吹吹，送到志华嘴里。志华喝了好几勺，感觉味道不错，说：“和我妈熬的一个味道。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“你妈现在在哪？”志华哽咽了。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“抱歉，是我多问了。今晚就别说了，要不等明天你身体好些了再说，我也告诉你我的故事。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("志华露出一丝微笑，吻了吻大山的手。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("大山从母亲这个话题转移开，看到碗里的粥，给志华讲述腊八节与释迦牟尼的故事。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("几分钟后，志华喝完了这碗八宝粥。大山去把碗放到了盆里，又回到志华身边。大山从志华的目光上看出她好像有其他心事，问：“妹子还有其他放心不下需要帮忙的吗？哥能帮上的一定尽力。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“我的两个哥哥从昨天上午与我走散到现在一直杳无音信，我在担心他们的处境。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("大山从裤兜里拿出怀表看了看，已经是午夜三点多了，说：“妹子这一天够辛苦的，先睡吧。明天等我的两位队友回来，我让他们去北平南站附近打探一下。妹子一定要养好身子，要不两位哥哥会担心的。”");
					sb.append("</div>");
					sb.append("<div class=\"next_chap_nav_div\">");
						sb.append("大山哥的两位队友是谁？他们能否帮志华找到她的两位哥哥？请看下回分解。");
					sb.append("</div>");
					sb.append("<div>");
						sb.append("(1)现在流行帆布鞋的一种，不用系鞋带，左右两边有松紧带，脚后跟一蹬就能穿上。民国年代还没诞生，为了突出主角形象才有意穿帮加入的元素，望读者不要介意。");
					sb.append("</div>");
					sb.append("<div>");
						sb.append("(2)即耐克牌，在民国时期是不存在的。这里为了突出主角形象才有意穿帮加入的元素，望读者不要介意。");
					sb.append("</div>");
				sb.append("</div>");
			sb.append("</div>");
		sb.append("</div>");
		
		return sb.toString();
	}

	/**
	 * 获得第4章内容
	 * @return
	 */
	public static String getChapter4() {
		
		StringBuilder sb=new StringBuilder();
		sb.append("<div class=\"main_div\">");
			sb.append("<div class=\"chapter_div\">");
				sb.append("<h1 class=\"title_div\">");
					sb.append(CHAP4_TIT_NAME);
				sb.append("</h1>");
				sb.append("<div class=\"content_div\">");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("泥泞的道路上烙着一串串杂乱的脚印，有的是皮鞋留下的、有的是老北京布鞋留下的。从大小来看，两个布鞋印差不多一样、两个皮鞋印留下的痕迹却不一样。起初两个皮鞋印和两个布鞋印还掺和在一起，到了村口处，一个皮鞋印和两个布鞋印混在一起朝着一条路延伸，而另一个皮鞋印单独朝另一条路延伸。顺着三个脚印的那条路一直延伸下去，到了某个拐角处，皮鞋印突然消失了，两个布鞋印在这里徘徊了几步，朝前继续延伸去了。从泥土的粘稠度上看，像是十几分钟前印上去的。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“别跑了，山本，咱跑了快一个时辰，我都跑不动了。放心，咱早就把他们俩甩出十万八千里了。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("前面那位瘦高个依然跑着，只不过速度比以前慢了很多。后面那位矮胖子却力不从心的踉踉跄跄的，看上去跑不动了。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“快点，浅见，别掉队。听过《龟兔赛跑》的故事吧？你放松的时候正是别人前进的时候。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“知道你读书多，别卖弄中国文化，老子对中国式教育没半点兴趣。(1)”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“哎呀！你啥时变成老大了？其一：我比你大，应该喊我哥；其二：平田上校吩咐过，每次咱俩去执行任务都由我来掌管大权，你只不过是一名随从而已。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“那咱就骑驴看唱本，总有一天我的功劳会比你多。到时候平田上校提拔我，咱可就成反转局势了。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“那得看你的本事和运气了，现在说未免早了点。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“对了，张合、千代哪去了？不会是被那两个中国混混抓去了吧？”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“就凭你问这个问题，就说明你在平田眼里地位永远都不可能超过我。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“此话怎讲？”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“看来我说的没错，敲鼓不用重锤。不过现在不是说话的时候，咱找家客栈歇息时我再慢慢告诉你。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("两人继续跑着，山本看上去体力还颇为充足，浅见看上去已经快油尽灯枯了。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“坚持一会，有家大同客栈就在前面，以这种速度再坚持大约十来分钟就到了。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“我的天呀！还要十多分钟啊？”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“别废话，快跑吧，要是以你那王八速度下去，到天黑咱也到不了，说不好还会成人家的天鹅肉呢。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("两人继续跑着，这才不到傍晚，天就开始有种黑云压城城欲摧的感觉，天气变的异常闷热。几分钟后，天气开始下起雨来。两人还在路上马不停蹄的跑着，裤脚都粘上了淤泥。雨越下越大，山本的体质比浅见好太多，在雨里奔跑如同漫步一般。浅见则感觉视线模糊了，嘴里也进了雨水。途中摔倒好几次，整个人都成了落汤鸡。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("又过了十分钟左右，两人跑出了山间小路，前方数百米处客栈的轮廓在雨中若隐若现的显现出来。山本奔跑的速度好像达到了好几十迈，与浅见拉开了好几百米的距离，冲向客栈。浅见被远远甩在后面，一个趔趄整个人掉进了泥坑里，半天都没有爬出来。山本走进客栈后装出一副若无其事的样子，对店小二喊：“来一碗清汤荞麦面！”只点了自己的。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("不知过了多久，浅见才一瘸一拐的进了客栈，一副狼狈的样子，从门槛走过时还被绊了一跤。客栈里除了他们俩外还有大约七八个人，有几个人看到浅见差点摔倒，在位子上幸灾乐祸的暗暗匿笑。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“麻痹笑啥！活的不耐烦了是吧！”那几个人隐约的笑声停止了，脸上还带着酒窝窝。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“老老实实的坐下！”山本把手搭在浅见肩膀上，将其按在座位上。过了一两分钟，浅见的怒气渐渐平息了。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“自己点菜去！”山本刚说完，店小二端了一碗荞麦面走来，“先生，你的清汤荞麦面。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“多谢！”山本自己拿起筷子开吃了。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“老大，老弟陪你跑了大半天，你就这样子？”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“谁让你跑的跟王八似的，这是执行任务，落后就要被淘汰，没人闲等你。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("为了不耽搁时间，浅见看到狗不理包子刚出炉，就点了一笼现成的，大口大口的吃开了。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("过了几分钟，山本吃完后说：“你刚才不是有问题要问吗？又过了这么久想出为什么了吗？还是我直接告诉你？”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("浅见摇摇头。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“看来雨水真的把你脑子浇坏了，这次我就先敲你一锤，让你脑子里长根进筋。张合从小在中国长大，对中国的疆域比咱清楚多了，以他的脑子，就凭那两个中国人能这么轻易的就抓到他？还差得远呢。再说，他刚才在火车上只是观察形势，并没出手。千代小姐给咱发出警报，我偷偷的拿走了钱包，故意往车下溜走了，目的就是为了把那两个男子引下来。剩下的那位女子一人在车上，她已经和自己的人走散了，心里够乱了，根本不会把剩余的注意力放在张合、千代两个人身上。相反，千代已经碰瓷他们了，早就跑到别的车厢躲了起来，却在暗地里和张合一起观察那位女子的行踪。等女子到站后不得不下车，咱抢了他们的积蓄，她身上的钱已经不多了。她和张合又不认识，张合见机会来了会主动接近她，以住宿为理由给她地方住，女子在逆境中肯定会上套。女子落到张合手里，到时候那两位男子为了救她，不得不向咱求饶，咱说不定还能给他们洗脑，让他们加入咱组织呢。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“我的大哥，你还真有你的一套计谋，小弟甘拜下风。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“别叫我大哥，想跟我攀亲啊，咱俩没血缘关系，叫我老大！”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“是，我的老大！”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“这还差不多。再考你个问题，看通过刚才的交流你有进步没。你知道咱为何能甩开那两个中国人吗？”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“因为你个子高、腿长、跑的快呗。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
					sb.append("“你怎么记吃不记打。”山本朝浅见腿上踹了一脚，“难怪你叫‘浅见宽’，见识果然短浅、长的又矮又胖，正和这个‘宽’字。那我这次就告诉你好了，你看我从刚才被他们俩追赶前和之后咱又见面这期间，身上有何变化？”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("浅见从头到脚打量了好几遍山本，最后把目光停留在山本的脚上。“身材还是那么高大，只是刚才的那双皮鞋换了，换成了老北京布鞋。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“废话，老子本来就这么高大，还用你说。不过算你长点眼力，老子换成了布鞋，知道为何要这么做吗？”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“皮鞋穿着跑起来笨重，布鞋穿着跑起来轻便呗。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“唉幺！”山本又朝浅见腿上踹了一脚，“那我干脆从在火车上时就穿布鞋好了，为何先穿厚重的皮鞋，下车被追赶途中才换成布鞋？”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("浅见摇摇头，百思不得其解。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("原来与浅见说话的那位叫山本夫，是平田霸川的两位手下，早在几年前就随平田先生来中国执行一场秘密的任务(2)。山本夫比浅见宽有谋略，这几年来在好几次派遣中表现都受到平田先生的青睐。浅见则比较呆滞，这几次行动中，平田都派山本监督他。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“山东一带多以泥土地为主，尤其是鲁西北一带。因为我身上有他们俩的积蓄，你又矮又胖又笨，跑的又慢，很容易被他们追上。我有意事先穿上厚底皮鞋，在道路分叉处把积蓄交给了你，再把他俩引下车后往有泥土地方向跑，让皮鞋鞋底在泥土上留下脚印。积蓄在我身上，等进入水泥地区域时，感觉已经拉开他们一段距离了，就快速换上布鞋，把厚底皮鞋还留在身上，不给现场留下任何破绽，从另一条道溜出去，往相反方向跑。他们俩只顾追回积蓄，是很难发现这点的。当他们追到那块区域，发现脚印到此没有了，就没辙了。这招叫声东击西，他们绞尽脑汁也想不到我的这主意。就算刚才他们侥幸追上了我，但积蓄又不在我身上。顶多把我抓起来拷问，受几天皮肉之苦。凭平田先生的智慧，会想办法把我救出来的。平田在很多地方都有租界，他们又不敢要我的性命。假如迟迟不肯放我，平田向租界施加压力，他们到时候不得不放我。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“谁说想不到你的主意？”门口两张嘴异口同声的说，其中一位说：“有的人就是自作聪明，聪明反被聪明误。”");
					sb.append("</div>");
					sb.append("<div class=\"next_chap_nav_div\">");
						sb.append("门口的两位是谁？与山本夫和浅见宽将展开怎样的争斗？志华和大山那边又是什么情况？请看下回分解。");
					sb.append("</div>");
					sb.append("<div>");
						sb.append("(1)这段对话场景中说的是日语，这里为了让中国读者看懂，用了中文。");
					sb.append("</div>");
					sb.append("<div>");
						sb.append("(2)平田受天皇命令来中国执行的一场计划，具体内容将在后面的章节揭晓，请读着继续关注。");
					sb.append("</div>");
				sb.append("</div>");
			sb.append("</div>");
		sb.append("</div>");
		
		return sb.toString();
	}

	/**
	 * 获得第5章内容
	 * @return
	 */
	public static String getChapter5() {
		
		StringBuilder sb=new StringBuilder();
		sb.append("<div class=\"main_div\">");
			sb.append("<div class=\"chapter_div\">");
				sb.append("<h1 class=\"title_div\">");
					sb.append(CHAP5_TIT_NAME);
				sb.append("</h1>");
				sb.append("<div class=\"content_div\">");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“喔。。。喔。。。”太阳才刚从地平线冉冉升起，各家各户的鸡就开始打鸣。随着一声声鸡鸣声，夜色逐渐褪去。昨夜雨夜里那种黑云压城的黑暗逐渐消失，取而代之的是拂晓的黎明。村庄上空好几千米的地方挂着一道彩虹，从轮廓上看去就像是传说中七夕节时牛郎织女相逢时的鹊桥。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("乔大山一早就起来忙碌了，平日每天虽起的早，但比今天晚半小时。前段日子他被龙师长派去山东境内送情报，与之同行的还有两位队友，一位姓宋名大安、另一位姓翟名兆军。兆军顺路要回家一趟看望年迈的老母，大安也随之去了，大山就先回来。正好昨晚他路过城南站遇见了志华被一位喽啰蹂躏，就出手相助，三下五除二的将其打倒。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("大山把昨晚熬的八宝粥又放灶上加热过，看到妹子正在熟睡未醒，床边的痰盂里盛着一半澄清的尿液，看上去不像昨晚那么浑浊了。炉子边那双黄色花纹底的vans一脚蹬黑色帆布鞋和白色棉袜已经烘干了，大山把脚上那双nike白袜脱下来，见袜底、袜头处有些黑黄色（昨晚去茅厕时穿着拖鞋踩在雨水里浸的），便用蓝月亮洗衣液泡在木盆里。换上帆布鞋和adidas棉袜，抬着痰盂踏出门槛去了茅厕(<a class=\"img_a\" href=\""+CHAP5_IMAGE_PATH+"001.png\" target=\"_blank\">图</a>)。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("回来后看到志华睁着眼睛在盯着他，目光比昨晚有了神气。看了看怀表已是七点整，昨晚照顾妹子只睡了三个半小时。屋里一共三张床，妹子睡的那张床是大山的，昨晚大山睡在大安的床上，兆军的床空着。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“妹子感觉怎样？有啥需要哥帮忙的？”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“好多了，没啥忙，只是想多看会哥。哥看样子年龄也有二十多了吧？”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“二十五，妹子多大？”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“二十三。哥的脸色看上去太俊了。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“哪里话？妹子现在的脸面看上去才是最美的。”大山端了碗粥往志华嘴里送。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“不用麻烦哥，妹子感觉好多了，自己下去舀就行。”志华刚要下床，发现一字带布鞋和棉袜还在火炉边烘着，那双vans一脚蹬帆布鞋和adidas白袜不见了。低头看到穿在大山哥脚上，帆布鞋左右两边带着白色松紧带，颜色和袜子颜色接近，不仔细看好像鞋子两边没有松紧带似的。大山穿着帆布鞋走的很轻快自如，只是鞋底很薄（约1cm左右），走路时白色脚底能感觉到水泥地面。大山本来就不高，穿着它感觉和光脚时身高没有太大变化。这双帆布鞋是他几年前入伍时龙师长特意找鞋匠给他订做的，大安、兆军和队伍里其他军人都穿圆口布鞋，唯独他是连长，穿的鞋子和其他人的不一样。虽然鞋底很薄，大山穿着它不显高，却不在意这些细节。这几年穿着它上过好几次战场，立过汗马功劳，被评过很多次先锋，那些荣誉证书正挂在墙上。大山走到炉子旁，摘下挂着的一字带鞋放在妹子床边。志华穿上它和白色棉袜，缓缓的站起身走到锅前又舀了一碗粥暖暖身子。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("大山见志华现在能自己走动，踏实多了，便走到锅前下了一绺挂面。端上饭桌时，发现志华手里拿着一双nike棉袜挂在炉子架上。原来志华觉得欠大山人情，就趁他做饭时到木盆旁把大山刚才浸泡在里面的那双白袜替他洗了。志华雷厉风行，不一会功夫就洗完了，把袜子上面黑黄色的区域洗的雪白雪白的，除了袜子是湿的外，其他地方和新买来的一模一样。大山从小到现在一直穿着白色袜子，他有三双袜子都是白色的，一双阿迪牌的、一双没有商标的、剩下就是这双。这双袜子已经穿过好几个月了，在战场战斗时就一直穿，有时好几天都没洗过，上面有些部分早就变色洗不出来了。志华的行李箱里装着牙膏，她把上面涂上牙膏尝试着搓了好几遍，真的洗回原来的白色了。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("大山端了两碗面道餐桌上，从碗厨里拿出两双筷子，整齐的摆在碗右边。大山刚才去茅厕时，帆布鞋鞋边粘上了泥土。志华趁大山挑面时，用软毛刷把大山的帆布鞋的白色鞋边刷的一尘不染。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("两人吃完面后，大山怕志华又抢着干活，自己抢先把餐桌擦干、饭碗刷干净。对着镜子梳理了穿着，和志华一起去城南站找志华的两位哥哥去了。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("外面的雨在几小时前就停了，现在路上的积水也干了不少。大山住的地方叫惠安馆，是一条长长的巷子。出了巷子，一条大路显现出来，好几位黄包车夫在拉车。大山和志华却没有乘车，他们边走边聊。帆布鞋和一字带鞋并排着踏过一块块正六边形地面、踩过鹅卵石。志华告诉大山自己的遭遇（前几章已经讲了，这里不多说）。大山见志华比较憨厚老实，就开始讲述了一段段自己的往事。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("那是好几十年前的甲午战争年代，乔大山的父亲乔英曾是位前清武状元，十八般武艺样样精通，打枪百发百中。邓世昌看他是一表人才，收他当部下，部队参加了甲午战争。中国自爱新觉罗皇太极创立了大清王朝起，往后的好几百年里一直闭关锁国、固步自封。而日本在明治天皇的统治下开启了明治维新运动，军事实力超越了中国。甲午战争中邓世昌领导的军队全军覆没，之前洋务运动创下的基业就这样毁于一旦。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("甲午战争中国是失败方，半殖民地半封建社会的统治依然持续着。历史上记载着邓世昌领导的北洋海军全军覆没，但乔英是武状元出身，水性比较好，扶着一块军舰残骸在大海上漂流，漂到了岸边。血肉之躯毕竟不是铁打的，乔英因作战加漂流，体力消耗过大，身体离开了残骸。吉人自有天相，一股巨浪将其冲到了岸边。正巧这天清晨，有位少女在海边捕鱼，看到了乔英躺在岸边，浑身冰冷，试试还有呼吸。女子费了九牛二虎之力才背起乔英，将其送回了龙府。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("掌柜禀报：“龙老爷！龙小姐回来了，还背着一位昏迷的男子。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("这位女子是龙老爷的干女儿，从小是位孤儿，被龙老爷从孤儿院收养的，跟随龙老爷姓。龙老爷的妻女在很多年前就被小日本给杀害了，这些年来他一直未娶妻生子。一次经过孤儿院，看到里面有位女孩的长相和他死去的亲女儿特别像，就收养她为干女儿，起名“龙小蝶”。转眼间小蝶已经二十岁了，还未结婚。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("小蝶不分男女，将昏迷的男子放在自己的床铺上。拿勺子舀了一勺参汤，缓缓的倒进男子嘴里。看到男子喉咙处蠕动，将其放倒在针头上盖好被子。男子偶尔说几句梦话。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("过了几小时，男子醒了，给小蝶讲述了自己的身世和遭遇。这位龙老爷是军官出身，人家都叫他“龙师长”。龙老爷一直很崇拜邓世昌，想找机会拜见他本人却一直没机会。可惜上天再也不给他机会，邓元帅这么早就为国捐躯，让他们阴阳两隔。龙老爷见乔英是邓元帅的部下，年级和小蝶差不多，又是武状元出身，干女儿跟着他一定会有安全感。决定收乔英为干儿子，并把千金许配给他。让乔英先养养身子，等过段时间再给他们俩办婚事。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("乔英在龙府每天吃着山珍海味，又与小蝶情投意合，才几天功夫身子骨又恢复到从前了。小蝶去捕鱼、骑马，乔英也跟在其身边当保镖。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("又过了一个月左右，两人就在龙府内举办了婚礼。龙老爷在县里人脉广，龙府里里外外门庭若市，很多钉子户都来为他的干儿子和干女儿送彩礼。龙老爷那段时间家里喜讯连连，看上去像返老还童似的，年轻了二十来岁。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("乔英自从娶了龙小蝶，就成了龙家人。每天除了照顾妻子外，还喜欢舞枪弄棒。由于武艺过人，得到了全县人的青睐。县里有几个人乃甲午风云时期受剥削无家可归，流亡到这里靠卖艺谋生的，便拜了乔英为师，住在了龙府。乔英每日传授他们各种武艺、龙老爷的队伍里招募士兵，他们自愿入伍。就这样，龙师长的队伍日益壮大起来。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("来年初春，有次龙老爷带着乔英夫妻去观音院烧香拜佛。小蝶闻到了香味，突然感觉想呕吐。乔英知道妻子已身怀六甲，便走到大雄宝殿的菩萨像跟前跪下祈祷：“大慈大悲的观世音菩萨，保佑我们龙家上上下下、老老小小往后的日子风调雨顺，保佑蝶儿早生贵子。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("回去的路上，乔英为蝶儿买了大枣、花生、桂圆、莲子(1)，希望与蝶儿终成眷属、白头偕老。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("大山讲着讲着，两人到了齐化门(2)。那里有卖驴打滚(3)的，两人一人买了一袋。出了齐化门，继续朝北平东郊方向行走，来到满井(4)。又一幕往事浮现在大山脑海，大山继续讲给志华听。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("初春的北平依然乍寒乍暖，乔英与蝶儿刚从满井回家。窗外的梅花在墙角盛开，远处山丘上还铺盖着厚厚的积雪。屋里，蝶儿在秉烛练字、乔英在吟诵着王安石的《梅花》。“墙角数枝梅，,凌寒独自开。遥知不是雪,为有暗香来。”咏后走到蝶儿的桌旁，看到羊皮纸上写着六个大字，三个一列，共两列，第一列的三个字是“乔大山”、第二列的三个字是“乔梅花”。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“想不到蝶儿还有这么一笔拿手好字，真人不露相啊！”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“哪里，老公过奖了，我是随便练练手而已。这两个名字是给咱孩子取的，生男孩就用第一个名字，生女孩就用第二个名字。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“老婆颇有文采，敢问这两个名字你是怎么想出来的？”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("蝶儿一只手指着“乔大山”三个字，另一只手指着窗外的山丘，说：“壁立千仞、无欲则刚(5)。要是男孩的话，我希望他和那座小山一样挺直、刚强。”蝶儿把一只手挪到“乔梅花”三个字的位置，另一只手又指向窗外的梅花，说：“梅逊雪三分白、雪却输梅一段香，梅花是岁寒三友(6)之一，不畏严寒盛开。我希望咱女儿也像梅花一样坚韧不拔。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("乔英听完上去拥抱着蝶儿，虽然是寒冬，两人的怀里却散发着春天般温暖。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("志华听了大山的这段回忆，说：“你爹娘后来就生了你这一个儿子，取名乔大山。正如你娘说的，这名字不错，你确实是位‘男人’。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“是两个孩子，本来我还有个妹妹，可是。。。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("不久蝶儿就顺产了一位男婴，大山过百岁时，县里的百姓很多都送给龙府一些彩礼，全家人憧憬着未来的好日子。天有不测风云、人有旦夕祸福，这些吉事乃暴风雨来临前的前兆。在乔大山两岁那年，局势发生了突变。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("八国联军初期，列强从天津大沽口入侵，驻边军奋力抵抗。列强用的是冲锋枪，而我军用的是小米步枪，抵挡不住了。驻边军给总部发电报，请求支援。龙师长接到电报，和乔英一起上了战场，留下蝶儿自己在家照顾大山。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("这场战争持续了好几个月，驻边战士连过年都没捞着回家。他们在战地上扎营值班，白夜两班倒，枕戈待旦，正是“醉里挑灯看剑，梦回吹角连营(7)”。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("刚“过完年”没几天，还没出十五，有人报告乔英“乔连长，外面有位女子要见你！”乔英听到后，手一麻，水壶掉在地上。乔英走出帐篷，看到蝶儿出现在面前。蝶儿手里拿着一套刚脱下来的男装，原来是女扮男装混进来的。见到丈夫后，哭着一把上去包住他。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“我的好丈夫，好几个月没见了，最近这些日子来，我总是夜长梦多，梦见你在战场上厮杀，每天眼皮不停的跳，只好通过女扮男装的方式混进来看看情况，见你一面我就放心了。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“大山怎样？”“挺好，长胖长个了，在家由奶娘照顾着呢。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("乔英带蝶儿进帐篷，倒了杯热茶给她暖暖身。往后的日子里，乔英曾好几次想派人护送蝶儿回北平，蝶儿拒绝了，说要陪着丈夫陪下去。乔英苦劝不下，龙师长见干孙女已经来了，只好将其留在干儿子身边，派了几位保镖保护着他们。往后的一段时间里，夫妻俩每晚睡在一起，白天乔英上前线作战，蝶儿留在帐篷里有保镖保护。直到那场激烈的战斗来临。。。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("大汶口是通往天津市里的必经之路，这场战役持续了半年多，列强对这里加大了火力。龙师长接到电台的消息，我军镇守不住准备计划着撤离。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("几个月前，乔英发现蝶儿的肚子变大了，和几年前大山出生前的征兆一模一样。原来蝶儿在来这里之前就已经怀上了，为了不让丈夫担心才隐瞒着来的。龙师长为了随时准备接生，派了两位连里的医生护送着蝶儿。前线的战士边撤离边抵抗列强，龙师长等人加快了撤离速度。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("一天夜里，蝶儿突然嗷嗷直叫，看来快要生了。这时，龙师长接到了电台情报，列强离这里只有几里了，前线抵挡不住，战士们伤亡惨重，让龙师长加速撤离。龙师长一向下达命令干脆了断，这次却不听前线的指令，坚持要干女儿把娃生下来，因为这里连里的希望。为了增加前线的兵力，乔英主动打前锋，带着几十位连里的士兵一起上阵。临走前对蝶儿答应下会平安回来的，蝶儿在产中，只听到了丈夫的话，顾不上回话。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("两个时辰过去了，帐篷里传来了“哇哇”哭声。护士对龙师长说：“师长，恭喜！大小姐生了个千金。”龙师长感到连里燃起了希望之火，这场战斗稳操胜券。可就在龙师长沾沾自喜时，接到了电台的情报，得知前线全军覆没，干儿子也在刚刚的战斗中殉职了。要龙师长等人马上撤离，刻不容缓。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("一向勇猛无畏的龙师长这次得知干儿子牺牲的消息，却在士兵面前放声大哭。蝶儿听到丈夫殉职的消息，晕了过去，任龙师长怎么唤都不醒。龙师长背起蝶儿，命部下收起帐篷撤离。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("蝶儿的脸颊搭在龙师长脖子上，龙师长感到她体温一直在飙升。跑着跑着停了下来，命大夫检查一下。大夫说大小姐得了产褥热，情况不妙。正当龙师长一筹莫展时，蝶儿微微的低声含糊的说了几句话：“我的好丈夫，就让咱女儿叫‘乔梅花’吧。墙角数枝梅，凌寒独自开。遥知不是雪，唯有。。。”没念完整诗就停住了，头歪向一边。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("龙师长命连长背起干女儿冰冷的尸体，自己抱着刚出生的千金，与连里其他士兵一起撤离了阵地。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("经过日以继夜的奔波，龙师长一连总算摆脱了敌人的追击，但总感觉不妙。试了试怀里的小千金，已经没了呼吸。龙师长眼前一黑，晕了过去。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("战场周围漆黑一片，地上躺着横七竖八的死尸。敌人成群结队的围攻上来，成圈包围了我军。乔英在不远处浴血奋战，掩护着不让敌人通过阵线。龙师长在阵营里死守，蝶儿正在艰难的生子。阵营圈越来越小，帐篷外有人来报：“报告师长，敌方火力猛，乔连长守不住了！”龙师长背上长枪出了帐篷，冲向前线。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("阵地那边敌人开始放冲天炮，一枚枚炮弹接种而来。地上已经血流成河，乔英和龙师长的军服染成了血红色，面目也模糊不清。就在霎时间，乔英一把推开了龙师长，自己被炸飞出好几米落在地上，一动不动。龙师长趴在地上，老远望见帐篷处燃起了熊熊大火，大喊：“蝶儿。。。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("成百上千的敌人突破了防线，把龙师长团团围住，一位喊：“去找你心爱的蝶儿吧。。。”刚说完就把枪口对着龙师长，拉起了枪栓。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“蝶儿。。。蝶儿。。。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“老爷醒醒，做噩梦了。”一个熟悉的声音在耳边萦绕。龙师长徐徐的睁开眼，发现自己躺在床上，旁边坐着陆连长。陆连长是乔英殉职后龙老爷新选拔的，背着蝶儿尸体的那位。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“我心爱的蝶儿呢？刚出生的千金呢？”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“蝶儿和千金都已经。。。。”龙老爷刚要下床，被陆连长扶着。“蝶儿的尸体躺在她的床上。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("陆连长搀扶着龙师长来到蝶儿的床边，看到一具冰冷的尸体，脸上起了斑块，旁边还躺着一具婴儿尸体。龙老爷痛哭不止，“准备一具棺材去！”“是！”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("就这样，蝶儿因产褥热离世、刚出生的千金也夭折了。龙老爷给小千金取名“乔梅花”，和干女儿一起入了土。乔英的尸体还在战场上没抬回来，老爷就把他生前穿过的衣物等入了土，立下衣冠冢(8)。三人的墓碑挨在一起，龙府的人一起祭拜。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("志华听着大山的家史，已热泪盈眶。两人走了好几个时辰，来到了北平南站。熙来攘往的人群一波又一波，有位10岁左右的报童在川流不息的人群里喊：“号外号外，蒋介石发动二次北伐，济南发生五三惨案(9)。。。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("报童喊着喊着走到了大山旁边，一时失手手里的报纸掉在大山的帆布鞋上。报童附身刚要捡，大山抢先捡起那卷报，吹了吹说：“孩子，我买了。”报童还在附身，看到大山的帆布鞋的白色鞋边上占了泥土。他缓缓的直起身子，接过叔叔手里的银子，又伸手进右裤兜掏出几个铜板，数了数铜板数量远远不够找钱，银子比这卷报纸的价格多了一倍还多，又在身上掏来掏去实在没有其他钱了。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("大山看到报童的手上有好几道皲裂(10)的口子，低头看到孩子的布鞋上露出了脚趾，明白了报童的苦衷，摸了摸孩子头说：“孩子，不用找钱了，多的钱拿去花吧！”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“不行，大叔，从小爹教育我要诚实守信。刚才给爹买药花光了上午卖报赚的钱，要不大叔等我会吧？等一会我卖报赚够了钱再找你怎样？”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“孩子，你爹身子不好吗？为何吃药？”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“我爹患鼠疮好几年了，我从没上过学，这几年来一直靠卖报或擦鞋赚钱谋生。这几天擦鞋的营生不好，我见站台附近人群多，就来这里卖报，遇上了你们。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“我的好孩子啊！要是信任我们的话，带我去你们家可以吗？我想看看情况。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("报童从头到脚打量了大山、志华二人，寻思了十来秒，便说：“好吧！”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“咱不是还要等我的两个哥哥吗？今天这趟来这里就是为了看他们是否能经过这里。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“就去这孩子家看一会就回来，这是当务之急。他们到站后会在这里等一会的，那边还有个候客厅呢，刚才我看过，他们目前是没来，等他们真的来了会去那里等咱们的。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“那好吧，孩子，带我们走吧。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“大叔、叔母，先等会。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“孩子还有啥事需要我们帮忙？”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("报童没说话，从左边的裤兜里掏出一块抹布，蹲下身在大山的vans帆布鞋的鞋边上擦了几圈，鞋边变回了最初的白边。孩子又把抹布内面翻出来、外面翻进去，又在两只脚的黑色的鞋面上来回擦了几回。整双鞋子变的干干净净，看上去跟新的一样。擦完后，又按程序给志华擦了一字带布鞋。报童跑到离这里最近的一间洗手间。不到一分钟，手里拿着干净的抹布走出来，跑到二人身边，说：“好了，大叔、叔母，现在可以走了。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“真是位懂事的孩子！”志华拍了拍报童的后脑勺。三个人影慢慢的走出了站台，在阳关的照射下逐渐拉长，渐行渐远。");
					sb.append("</div>");
					sb.append("<div class=\"next_chap_nav_div\">");
						sb.append("这位报童的家境究竟是什么情况？志华啥时才能找到失散的两位哥哥？请看下回分解。");
					sb.append("</div>");
					sb.append("<div>");
						sb.append("(1)大枣、花生、桂圆、莲子这四种果各取最后一个字，谐音连在一起即“早生贵子”。");
					sb.append("</div>");
					sb.append("<div>");
						sb.append("(2)原来叫“奇货门”，一些稀奇的货物都从这里运进城。后来根据北京话音译过来，就叫“齐化门”。");
					sb.append("</div>");
					sb.append("<div>");
						sb.append("(3)中国东北地区、老北京和天津卫的传统小吃之一。");
					sb.append("</div>");
					sb.append("<div>");
						sb.append("(4)位于北京安定门东三里外的一口古井,因“井高于地,泉高于井,四时不落”而得名。");
					sb.append("</div>");
					sb.append("<div>");
						sb.append("(5)出自林则徐的一副自勉联,全联是：“海纳百川 有容乃大 壁立千忉 无欲则刚”。");
					sb.append("</div>");
					sb.append("<div>");
						sb.append("(6)指的是松、竹、梅三种植物。松、竹、梅耐寒性强，不会因为冬季温度低而凋零，梅花还可于凌寒中独自开放，因此有“岁寒三友”之称。");
					sb.append("</div>");
					sb.append("<div>");
						sb.append("(7)出自北宋词人辛弃疾的《破阵子》。");
					sb.append("</div>");
					sb.append("<div>");
						sb.append("(8)葬有死者的衣冠等物品代替遗体下葬，而并未葬有死者遗体的墓葬。这是因为死者的遗体无法找到，或已葬在另一处，再于此地设衣冠冢以示纪念。");
					sb.append("</div>");
					sb.append("<div>");
						sb.append("(9)蒋介石发出第二次北伐的总攻令，命令各路革命军向北京方向进军。国民革命军占领济南，并与日本驻屯军发生激烈冲突，造成数百名中国平民死亡，史称“五三惨案”。");
					sb.append("</div>");
					sb.append("<div>");
						sb.append("(10)皮肤因暴露于风中或寒冷中而发生的裂口或变粗糙。 ");
					sb.append("</div>");
				sb.append("</div>");
			sb.append("</div>");
		sb.append("</div>");
		
		return sb.toString();
	}

	/**
	 * 获得第6章内容
	 * @return
	 */
	public static String getChapter6() {
		
		StringBuilder sb=new StringBuilder();
		sb.append("<div class=\"main_div\">");
			sb.append("<div class=\"chapter_div\">");
				sb.append("<h1 class=\"title_div\">");
					sb.append(CHAP6_TIT_NAME);
				sb.append("</h1>");
				sb.append("<div class=\"content_div\">");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("三双脚板踏过一方方青石板向前走着，一双穿着一字带布鞋，鞋面露着白色棉袜、一双穿着vans一脚蹬帆布鞋，虽然走了将近一天的路，看上去显的特别干净。最后一双穿着破旧的布鞋，鞋面露着脚背，没穿袜子，可能是这么穿习惯了而已。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("三人走了一会，大山听见报童的肚子咕咕叫，说：“孩子，中午没吃东西吧？咱找家店吃完再走。”报童想了想答应下来。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("志华听大山老是称呼报童“孩子”，感觉很不是滋味，便问：“孩子，我们该怎么称呼你？”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("报童说：“我叫‘葛宝’，我爹叫葛申。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“你娘呢？”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“我两岁那年娘就遭土匪杀害了，几年后我爹患病。曾去看过好几位郎中，都说这种病城里目前还没人能医治。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("大山说：“天无绝人之路，我觉得肯定有方子可以医治。咱先吃点东西，吃完后去小宝家看看他爹的情况。记得龙师长说过，他认识一位郎中，说不定有一线希望。实在不行再想别的办法，咱一定尽力帮小宝他爹。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("说着，三人进了家面店。大山对店小二喊：“来三碗清汤荞麦面！”三人找了张桌坐下。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("志华刚坐下就同意道：“说的对，郭靖当年为了给黄蓉疗伤，还翻山越岭的找到了一灯大师(1)。咱趁小宝爹活着时就得寻求一切源头，哪怕多走几个县城也得找到神医。我从小在黄土地里长大，两只脚还硬着呢。只是，恐怕得费几双鞋了。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“我也是”大山说：“我的这双脚这些年走过的路比一般人走过的桥还长，这双帆布鞋是义父特意为我订做的，穿着它五六年了，上过好几次战场。虽然鞋底薄薄的，到目前为止还没补过。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("葛宝听了叔叔阿姨的这些话，热泪盈眶，跪在他们面前磕头感谢。大山立马抓着小宝的胳膊将其搀扶起，说：“小宝，别这样，你是位孝顺懂事的乖孩子，认识你是叔叔阿姨的荣幸。快起来，男儿膝下有黄金。你往后的路还长着呢，等会去集市上，叔叔给你买双像样的鞋子你换上，要和叔叔这样，脚踏实地的走好每一步。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("小宝看到大山叔的帆布鞋摆在自己膝盖前十公分处，被自己擦的很干净，便把手放在大山叔的帆布鞋上，说：“叔叔这双帆布鞋不错，能让孩儿看看吗？冒犯了。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("大山觉得小宝听进去了自己刚才的谆谆教导，说：“害，这点小事还说啥冒犯，叔叔这些年来穿着它身经百战。你看吧！”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("大山大方的抬起了脚，小宝看了看鞋面，是黑色帆布材料做的，两边带着白色松紧带。又低头看了看鞋底，是黄色花纹材料的，鞋边是白色的，跟黑色鞋面缝合在一起，缝的很结实(<a class=\"img_a\" href=\""+CHAP6_IMAGE_PATH+"001.jpg\" target=\"_blank\">图</a>)。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“我可以看看鞋里吗？”葛宝怯生生的问，不敢抬头跟大山叔对视。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“当然。”大山说着毫不犹豫的脱掉右脚的帆布鞋，nike牌白袜脚露在外面(<a class=\"img_a\" href=\""+CHAP6_IMAGE_PATH+"003.png\" target=\"_blank\">图</a>)，心想：“从今早到现在走了一路，天热太捂脚了。正好趁满足这崽子欲望时，给白袜脚透透气。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("大山很自然的脱掉右脚的帆布鞋，右腿搭在左腿膝盖上。小宝看到大山叔动作很洒脱，自己显的受拘束，伸着手在半空，不敢像上次那样碰帆布鞋。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("大山见小宝腼腆的样子，亲手拿起自己刚脱掉的帆布鞋，递到小宝手里。小宝看了看鞋里，里面的鞋底是浅黄色的，印有黑色vans艺术字(<a class=\"img_a\" href=\""+CHAP6_IMAGE_PATH+"002.jpg\" target=\"_blank\">图</a>)。与地面接触的鞋底是黄色的，鞋底大约1cm厚，鞋底与鞋边粘的很结实。大山穿着他走了一上午，刚脱下来小宝的手感觉到里面热乎乎的。小宝看到大山叔的白袜脚，整双袜子都是纯白色的、干干净净的。小宝这时慢慢变的大方点了，与大山叔间的距离也拉近了很多。小宝把大山叔的裤腿往上一拉，看到了袜筒处有黑色的英文，写着“nike”字样，就问大山叔这个字怎么念。大山告诉小宝：“这不是中国汉字，是英国语言，读‘耐克’，跟着我读。”大山用口型教小宝读单词，小宝很快就学会了。小宝双手抓着大山叔的nike白袜脚摸了摸，摸完袜底摸袜背、摸袜跟、袜尖，感觉袜质不错，穿了好几个月没有出现起球现象。大山叔每晚都洗，小宝摸来摸去并没闻到异味。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("小宝脱掉自己那双破烂的布鞋，穿上大山叔的帆布鞋，感觉大了好几个号。于是亲手给大山叔穿回去，用食指提上鞋跟。说：“我特别喜欢大山叔的这双鞋子，要是我有一双一模一样的就好了。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“这简单，等带你去见龙爷爷，让他给你量身订做一双就行。龙爷爷除了认识一位郎中，还认识一位私塾的校长，正好看看找机会给你报名上学去。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“太好了！多谢大山叔。”小宝这次不给大山叔下跪，而是上去紧紧拥抱着大山叔和志华阿姨许久。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“清汤荞麦面来了！”店小二端上了三碗。小宝看到大山叔和志华阿姨动筷子，自己便狼吞虎咽的开吃了。大山把自己碗里的牛肉往小宝碗里夹了好几块，志华也这么做了。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("小宝看上去好像好些年没吃过这么好的饭菜了，大山、志华还没吃完，他已吃完一碗后还有些食欲。大山看出了小宝的心思，对店小二说：“再来碗清汤荞麦面！”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("不一会功夫，店小二便端上了一碗荞麦面。这时，大山刚吃完碗里的面，志华的碗里还剩几口，小宝又开始狼吞虎咽的吃开了。小宝才用了五分钟左右就吃完了第二碗面，大山去柜台结了账，三人出发了。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("小宝家就在出了齐化门往西北方向走，进了一条胡同，有间很老的小屋里。小宝推开房门，屋里正对着那张床上蜷缩着一位男子。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“爹，我回来了。”小宝用比较清晰的语气喊。男子艰难的把头从朝着墙的那方转过来，大山、志华看到这位被小宝叫做“爹”的看上去已有五六十岁左右的样子。葛申看到除了儿子外，旁边还站着两位自己不认识的陌生人，便问：“这两位是？”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“这位叔叔和阿姨是我的恩人，他们说有法子可以医治爹的鼠疮，还能想办法供我读书。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“你好小宝的爹，很高兴认识你。今天我们路上遇到这位孩子，买了他的报纸，钱多了找不开，他不仅没要，还帮我擦了鞋，真是位懂事、孝顺的好孩子。这么好的年龄不上学去当报童太可惜了，要不从明天起别让他去卖报了，现在动荡国情。不如我去找找关系给您医治试试，顺便让小宝去读私塾，你看如何？”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“真是太感谢你们两位救命恩人了”葛申咳嗽着说：“小宝叫我’爹‘，你们看我像五六十岁了是吧？没错，我今年差一年花甲。你们也许会有疑问，为何年级这么大了才当爹？我见你们可靠就告诉你们好了。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("大山、志华坐在葛申床边的马扎上，双目炯炯有神的注视着葛叔脸庞。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“我这身老骨头也是军人出身，年轻时当过兵，上过战场身经百战。在战场上杀敌无数，立过汗马功劳。几十年前的八国联军时代，我曾在大汶口出抵挡列强入侵，但敌方实在太强悍了，我方寡不敌众。当时连里的乔连长和部下都牺牲了，唯独我自己从山坡上失足滚了下去。当我醒来时，发现自己躺在床上，浑身上下摔的遍体鳞伤，想动都动弹不得。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“葛叔刚才提的那位乔连长是不是叫‘乔英’？是位前清武状元。”大山问：");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“正是！你怎么知道？难道你是？”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“我就是乔连长的儿子乔大山。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("葛叔听后感到激动，在病床上立起身子上下打量乔大山，道：“你这身板和你父亲当年一个风范，虎父无犬子，不亏是乔连长的儿子啊，你们乔家有你就有希望，国家危难时刻正需要你这种知青作栋梁。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“葛叔过奖，我只不过是龙师长麾下的一位无名小卒，不足挂齿。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“瞧，中国式虚伪，小乔太低调了。对了，龙师长现在还好吧？当年我也是半路上入伍的，入伍不久就发生刚说的事跟龙师长失散了。当我养好伤后又去了阵地，却没找到他。他提过他住在龙府，这些年来我一直打听却没打听到。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“龙师长非常健壮，半个月前我还见过他。父亲走后，我从小就是被他一把屎一把尿拉扯大的。我的这双鞋就是他找人特地为我量身订做的，刚才你儿子还给擦过。记得他常告诫我的那句话‘流血流汗不流泪，掉皮掉肉不掉队’。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“好骨气！你是快好苗子。”葛叔看了看大山脚上穿的帆布鞋，鞋面鞋边干干净净的，伸手摸了摸儿子葛宝的脑袋，说：“懂事的孩子。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“等有机会让龙师长来见见葛叔。”大山又问：“对了葛叔，刚才你说到躺在床上不能动，哪是谁救了你呢？”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("葛叔回答：“救我的那位是一位少女，叫‘秋琴’，她到溪边捕鱼，见我在水里漂泊，就动了恻隐之心，把我救到她家里。我醒来后她告诉我这个村庄叫做药勺村，因为一件事而得名。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("葛叔给大山、志华讲述着村名的由来。在秋琴认识葛申的几年前，有次秋琴到溪边洗澡。她的水性很好，边洗边潜到水底捕鱼，突然间感到肚子特别痛疼，像是得了绞肠痧似的。秋琴便上了岸，在岸边翻来覆去，疼痛感一直加重。秋琴放弃了求生的欲望，想临走前吃点东西撑死算了。看到树下有个红通通的东西，也不管有没有毒就拿起来吃下去。没过多久，秋琴反而感觉痛疼感逐渐减轻了，想排泄。想到自己是位姑娘，于是跑到树下一处见不到人的地方，解开腰带蹲下便解。排完后发现一堆蛇卵，原来是刚才游泳时不小心吃进去蛇卵才导致腹部痛疼的。秋琴吃下去的是槟榔，是一种驱虫药。不久秋琴的爹当了村长，便给这村子起名“药勺村”。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“大叔所说的‘秋琴’姑娘就是小宝的母亲吗？”志华问：");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“没错”葛叔回答：“常言道‘大难不死必有后福’，可命运有时往往是无情的，天若有情天亦老。”葛叔继续讲述后面的故事。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("葛申在秋琴的精心照料下，身子骨很快就康复了。秋琴知道葛申的身世后，两人的关系日益密切。不到一年，两人便成了亲。秋琴怀胎十月生下了个小千金，葛申见她脸蛋通红，现在正是百花盛开的季节，便取名葛红花，小名小花。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“他不是叫‘小宝’，是位小少爷吗？”大山看着一旁的小宝迷惑的问：");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“先听葛叔讲完嘛。”身边的志华掐了掐大山的胳膊。葛叔咳嗽了一声，继续讲。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("本以为药勺村的日子会越来越好，谁知这种安定日子才维持了一年多，有帮土匪来药勺村打家劫舍，乱杀百姓。葛申是军人出身，秋琴和丈夫在一起快两年了，也学了点本事，夫妻二人联合其他村名与土匪相抗衡。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("常言道：“邪不压正。”在村民们的反击下，土匪被剿灭了大半，但村里的百姓也死伤很多，包括秋琴的父母都在战斗中牺牲了。土匪头目穿着一身黑衣，自称“黑袍”，武艺高强，单凭葛申一人就与其斗了三百回合不分胜负。秋琴远不是其对手，葛申有几次与其拼杀刚要占上风，黑袍就把矛头转向秋琴，葛申就分心去保护秋琴。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("有位土匪从葛申的房里抢出了一个襁褓，里面传出婴儿的哭声，正是小花。夫妻俩见女儿被土匪抢走了，不顾一切上前营救。可能是母爱的伟大，秋琴瞬间以迅雷不及掩耳之势冲到了那位土匪身后，一刀将其杀下马来。可就在秋琴冲到他身后之前，小花被土匪扔到了黑袍手里。秋琴不顾是否能赢就冲上前去与黑袍殊死搏斗，母爱激发了秋琴的潜力，看上去好像功力瞬间飙升到丈夫的水平，居然和黑袍打的不相伯仲。秋琴虽然功力飙升好几成，但毕竟投鼠忌器，小花还在黑袍手中，生怕有个闪失伤到或吓到女儿。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("黑袍好像看穿了秋琴的顾忌，根本不顾怀里的婴儿死活，硬是想干掉眼前这位女子。秋琴看清了黑袍的招式，找准时机一刀砍在黑袍的手臂上。黑袍大叫一声松开了手臂，怀里的婴儿瞬间掉下马来。秋琴也从马背上跃下来滚在地上，背朝地面朝天，伸开双臂接住了小花。可就在这一瞬间，黑袍手里握着刀在距离地面一米处对准母子直刺下来。秋琴首先想到的是把怀里的小花移开，就这一动作耽搁的一秒钟，黑袍的刀已经刺到离地面半米处了。秋琴刚才接小花时扔掉了手里的刀，不然黑袍这招来的虽快，秋琴很容易就化解了。现在秋琴只能手无寸铁的硬接，便用双手抓住了黑袍的刀刃。由于黑袍的重力，刀尖继续下降，一股殷红色液体顺着秋琴的指头缝里流出。秋琴的双脚也上了阵，和双手一起夹住了黑袍的刀刃，刀尖这才慢慢的停止了下降，但刀尖已经到距离秋琴心窝一英寸处了，秋琴的双脚踩在黑袍胸口处，黑袍无法继续发力。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("这种局面僵持了好几秒，突然间“啪”的一声响起，刀的前半截被秋琴折断了。没有了刀尖的威胁，秋琴瞬间双脚一发力，双腿一蹬把黑袍蹬开。就在蹬开的一瞬间，黑袍双手也一发力把刀的后半截朝下发了下去。秋琴以为蹬起黑袍后自己安全了，没料到对方会使这招令其猝不及防。不过后半截刀并没有插进秋琴的心窝，因为蹬时下身挡在了刀的下面，所以后半截刀插进了秋琴的阴部处大约十公分左右。正在黑袍看到秋琴受伤沾沾自喜时，自己的心窝处也插入了刀尖。原来刚才秋琴蹬起黑袍的瞬间，把折断的前半截刀尖借力发了出去，正中黑袍心窝，黑袍当场毙命。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("小花的襁褓就在秋琴身旁一米左右的地方，里面发出一句句含糊的呼唤“妈。。。妈。。。”毕竟小花才不到两岁，刚学会说话不久。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("剩余的土匪被村民们杀退了，所剩无几。葛申抱着旁边的小花跪在妻子身边，看到妻子除了阴部处殷红一片，其他地方倒是没啥大伤。秋琴嘴里断断续续念着：“小花。。。”葛申试试妻子鼻孔处还有呼吸，非常微弱，便把妻子抱上马，带着小花一起往村外去了，其他村民也护送着一起走了。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("葛申驾马行了大约半个时辰，来到一处医馆，让一位村民先抱着小花，自己进去一会。小花虽然被父母以外的人抱着，但比较听话。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("过了大约一个时辰左右，葛申抱着妻子从里面出来，骑上马对那几位村民说：“跟我去个地方！”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("原来刚才医馆的大夫脱掉秋琴的裤子，看到里面垫着卫生巾，是她不久前来事前垫上的。大夫拿掉卫生巾后，看到阴部已经被刀刃穿透了，包括卵巢内部也受伤严重。还好没有伤到五脏六腑这些要害处，不过也得处理下，要不一旦小便时会出现感染。大夫给她做了个小手术，把阴部伤口处缝合上，用纱布包扎好。这只是为了一时不感染，还需要正经治疗。这需要进行一次大手术，告诉葛申有个地方离这里好几十里路，有位自称医圣的人，能通过高明的医术康复患者，不知能否医治这位女子的伤，何不抱有一丝希望去试试看。提醒葛申就算人家能治好这种程度的伤，在治好前这段时间（不管要多久、不管她之前喝了多少水，憋到什么程度，甚至选择憋死）一定嘱咐不能让女子小解，否则将会有感染的可能，甚至有生命危险。葛申把嘴趴在妻子耳边一字一句的叮嘱了，妻子轻轻点了点头。秋琴平日里一天至少要小解3-5次，今天从与土匪厮杀到现在，已经过去五六个小时了，没看到妻子小解过。葛申为妻子担忧，不知妻子还得憋多久？是否真的能挺过去？她是为女子，而自己是位男子，憋的能耐比妻子强，巴不得自己替妻子扛过这一难关。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("葛申为了早一刻帮妻子度过难关，便快马加鞭的朝目的地出发了。");
					sb.append("</div>");
					sb.append("<div class=\"next_chap_nav_div\">");
						sb.append("那位自称“医圣”的究竟是何许人也？真的能治好秋琴的伤吗？请看下回分解。");
					sb.append("</div>");
					sb.append("<div>");
						sb.append("(1)这些都是金庸先生的作品《射雕英雄传》里的人物，具体情节详见《射》。");
					sb.append("</div>");
				sb.append("</div>");
			sb.append("</div>");
		sb.append("</div>");
		
		return sb.toString();
	}

	/**
	 * 获得第7章内容
	 * @return
	 */
	public static String getChapter7() {
		
		StringBuilder sb=new StringBuilder();
		sb.append("<div class=\"main_div\">");
			sb.append("<div class=\"chapter_div\">");
				sb.append("<h1 class=\"title_div\">");
					sb.append(CHAP7_TIT_NAME);
				sb.append("</h1>");
				sb.append("<div class=\"content_div\">");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("大夫给葛申一封信，那位医圣人家都叫他“达摩祖师”，一般不给外人疗伤，除非看到他写的书信才行。信上写着地址是积米崖，葛申和几个村民按大夫给的地址四处打听，打听了好几十家，都说从没听到这个地方。葛申按照信上写的方向行走的没错，这点可以确定。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("秋琴躺在马背上，为了疗伤，已经一天一夜没吃喝了。秋琴还有意识，为了不让丈夫担心，就算有再强的尿意也得自己忍着不作声。有位村民劝道：“葛队，咱已经一天一夜没休息了，再这样漫无目的的跑下去也不是办法，不如先找家客栈歇息几小时再赶路，你看如何？”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("葛申想想，队友说的不是没道理，再这样找下去没有线索也是一筹莫展。骑马往前走了一小会，找了家名叫“红尘客栈”的旅店休憩下。租了个双人间和一间多人间，自己和妻子住双人间、队里其他人住那间多人间。将妻子安顿在旁边的床上，自己睡另一张床。葛申经过一天一夜马不停蹄的奔波，已经疲劳至极，一躺下直接睡着了，连鞋子都没脱。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("也不知睡了多久，突然耳边有个声音说：“葛队，醒醒，我打听到积米崖了。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("葛申听到后，身上如同触电一般，猛的从床上一跃而起。看了看墙上的挂钟，自己才睡了不到两个钟头。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("原来是队里的一位百姓，刚才在和老板闲聊时，老板无意间提到这家客栈名字的由来。当年这里大部分人感染了瘟疫，很多人都去世了，只有少部分人移民了，剩下的愿意留下来寻找去除的法子。他们配了很多方子都无法医治瘟疫，正当一筹莫展时，一位传教士经过这座村庄。村民以为他不了解这里目前的情况，告知与其，让其离这里越远越好。而那位传教士却说：“我此行就是来侦查这里的病情，听几位搬迁的居民说这里流行瘟疫，我离开天竺国(1)来中国传教，经过西域时也曾遇见好几座村庄流行各种怪病，都将其医治了，要是你们不介意的话，我可以尝试着驱除病魔。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("村民们听了这位传教士的话，不管真假都不约而同的给其下跪。传教士将离他最近的一位扶起，告诉大家其身份。他从小信仰佛教，是位出家僧人，来中国游历已经有两三年了，人家称其“达摩僧”或“达摩祖师”。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("达摩僧给配了方子，村民们都照着方子上所说的配药。达摩每日念经，说是为了驱散魑魅魍魉(2)。经过一月有余，村里的疫情果然大有好转，原来因疫情移民的那些人听说病根驱除了，也都纷纷的回到了这里。在这位达摩的度化下，很多村民对世间真理有所感悟，看破红尘。老板受到熏陶也变的有智慧，就开了这家客栈，取名“红尘客栈”。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("达摩立了汗马功劳，自那时起，村里年年风调雨顺、五谷丰登，麦子长的呈金黄色的老高了。达摩在这里待久了，与父老乡亲们日久生情，便不打算去其他更远的地方了，就在离村庄三舍(3)外的一座山上开了座寺庙“白云观”。寺庙坐落于一座山上，山势比较陡峭。因其为百姓造福，百姓把那座山叫做“积米崖”。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("从红尘客栈到积米崖的路上要经过一处黑枫林，那里离这村庄有二舍路，是去往积米崖的必经之路。白天还好说，听说夜晚里到了酉时往后就会出现一系列灵异事件。村里有好几个人夜晚去那里却有去无回，后来白天在树林里发现了他们的残骸。从残骸上可以看出已死去多时，而且死前像是经历了很痛苦的折磨。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("听到这些，葛申就感觉不寒而栗。看了看怀表，再过半小时就到酉时了。为了早日救回妻子，已顾不上前路上会充满多少不可思议的冒险，多浪费一分钟，妻子就多一分危险。葛申二话不说就拜谢过店老板，往积米崖方向出发了。葛申并没退房，说要是运气好能活着回来，就和店老板拜把子，到时候设宴好好庆贺一番。村里随来的队友都一同跟随葛队前去了。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("一伙人骑着马离开了红尘客栈，秋琴就搭在葛申的马背上。头一舍路比较顺利，四周都是万家灯火的房舍。虽然已是夜晚，仍有很多人在户外纳凉。队友李吉很自信的说：“店老板还扯什么晚上闹鬼，我看都是无稽之谈，人正不怕影子歪。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("小七却谨慎的说：“老板的话不可不信，毕竟他在这里开店很多年了，怎能拿这等事哄我们当儿戏？还是小心为妙，宁可信其有不可信其无。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“还是小七说的有理。”葛申提醒大家说：“前面马上就要进入黑枫林了，大家须打起十二分精神头来。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“是！谢葛队提醒！”大家异口同声的回答：");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("渐渐的队伍走出了村庄，村庄的影子离大家越来越远。有一座黑色的树林在远方用肉眼依稀可见，随着马蹄的行走逐渐清晰的出现在大伙眼里。夜风嗖嗖的刮着，给壮大的队伍增添了几分凄凉。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“要是咱能像孙猴子一样一个筋斗十万八千里就好了，早就翻过了这鬼地方，一下就到积米崖了。”刚才还自以为是的李吉现在却增添了几分胆怯，“要不咱先回客栈吧？葛队，等约摸天快亮了再来这里，那样会大大增加几分安全感。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“少废话！要真像你说的那样，我还冒险来这里干嘛？”葛队当众指责道：“小花我已经托付给老板了，就是担心万一自己有啥不测。你琴姐已经好几天没小解了，现在正憋得慌，耽搁一分钟就给她增添了一分钟的危机。你以为大家都愿意为我冒险吗？”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("被葛队这么一说，李吉的胆怯感倒减退了几分。黑枫林已经距离队伍不到二百米了，葛队下令：“大家准备点燃火把，准备入林！”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("人群中燃起了一股股熊熊火焰，与此同时，道路旁边出现了浅蓝色类似鬼火的玩意。李吉差点叫出声来，险些从马背上摔下来。李吉这一叫，队里其他人也跟着乱了起来，拿起刀做好防备。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“莫怕！”葛队喊：“这是磷火(4)而已。”队里其他人看到道路一边的草地另一头有一方方坟墓，这里是一块墓地。这才安静了下来，继续起码往前行。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("刚前行了几十步左右，从墓地的方向露出一双双眼睛，紧接着一排排弓箭朝队伍这边射来。大家挥刀隔档，有几位没防住的中箭栽下马来。葛申奋力隔档同时，还保护着搭在马背上的妻子。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("一阵阵震耳欲聋的厮杀声从墓地处出发，一伙蒙面黑衣人大喊：“识货的留下钱财，不然拿命来！”两帮人杀成一团，杀声震天撼地。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("虽然葛队一伙头一次来这黑枫林，但经过几十回合的厮杀，葛申这边看上去占了上风。流寇们杀不过，便改变计策，抱着秋琴便跑。这伙土匪们分散开跑了，葛队的人也分散开去追，大家都散开了。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("那个抱着秋琴的土匪看上去跑的速度比葛申骑着马的速度还稍快，但葛申为了能救回妻子，快马加鞭瞬间也提速上去穷追不舍。离那人越来越近，眼看就要追上，那人突然朝葛申发射了一枚石子，速度之快堪比没羽箭(5)。葛申猝不及防，看到石子飞过来想躲已晚，只能略微歪头，石子打在其右肩上。葛申忍住痛疼继续穷追，好像变成了那人的影子似的。眼看快要追上了，葛申一个跳跃跳下马来飞到土匪身后，将其按倒在地，撤下面具一看，原来是上次和黑袍一起来打劫的那伙人其中之一。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“说！你们是什么来路？”葛申把匕首架在土匪脖子上质问。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“我说。。。我们是黑袍手下的，这几年来晚上经常在这里埋伏，一旦有人经过就打劫，白天到其他地方去打家劫舍。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“你们的老窝在哪？”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“就在这里西北方五十里的黑风寨处，来这里的人经常迷路，唯一的出口在正北方向，必须带着指南针才行。大哥，我告诉你这些，求你网开一面，放我一条生路好吗？”土匪看着葛申狰狞的表情央求道。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“啊。。。”土匪刚说完才几秒就一命归西。“留着你是个祸害。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("葛申试了试倒在一旁的妻子，还有呼吸，这才放心的背起她放在马背上骑着马朝最初的地方驶去。到了原地再找其他人，早已不见了行踪。两人在林子里骑马继续前行，倒是没再遇到新的危机，只是不管朝什么方向走总是回到原处，就像被困在迷宫里一样。葛申回想起那位土匪说的话，只要往北走就能找到出口，可身上并没有带指南针。现在感觉又累又饿又渴，真像找地躺下先困一觉等明早天亮再说，到时候说不定会发现新线索。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("马背上放着一百多斤重的妻子，马儿速度逐渐慢了下来。葛申感觉体力透支实在太大，撑不住栽倒下马来，妻子栽下来面朝地背朝天趴在地上。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("秋琴嘴里进了泥土，有气无力的呻吟道：“不要管我了，自己先走吧。。。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“那怎么能行？咱是夫妻啊，这一趟来就是为了给你疗伤才苦寻达摩祖师的。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("葛申面朝天背朝地躺着，看着缥缈的夜空中划过一道流星。传说中看到天上有流星划过，预示着将有人去上帝那里了，这个人会是谁呢？自己？妻子？希望都不是，因为还有小花在客栈里，需要等妈妈医治好伤回去后抚养呢，上帝不会在孩子才是婴儿时就让其成为孤儿。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("天空上一朵朵乌云飘过，无数繁星星罗棋布的点缀着。葛申躺在冰冷的地上呆滞的望着那些天象，在银河的两边有两颗星星，一颗是牛郎星、另一颗肯定是织女星。它们之间隔着一条浩瀚的天河，正是当初王母娘娘用簪子划出的。牛郎从小就是孤儿，受哥哥姐姐的虐待。长大后好容易遇上了织女，却因天条的垄断，每年只能与其见一次面。王母娘娘造就的悲剧除牛郎与织女这对外，还有巫山神女(6)。两情若是久长时，又岂在朝朝暮暮(7)。虽然自己与妻子现在的处境窘迫，在漆黑的深夜遥望着星空，忍受着冻饿之虞，享受着淡蓝色的孤寂，但却感觉是天底下最幸福的一对佳偶。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("葛申忽然感觉呼吸有点困难，天空突然下起雨来，黄豆般雨点打在脸颊上。周围都是树林，没有帐篷或山洞之类可以躲雨的地方，其他队友不知去向。于是把自己身上的貂皮大衣脱下，搭在一旁的妻子身上。希望雨能快些停住，但却和自己的心情一样，越下越大。葛申感到背下的泥土变的黏糊糊的，大衣已经脱掉了，内衣也粘上了淤泥。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("葛申正想入非非，突然看到了北斗七星，真是“山重水复疑无路，柳暗花明又一村(8)”.身体如受到电击一般，猛地从地上跳起来,背上地面上的妻子放到马鞍上，说：“天助咱也，有希望了。”便骑上马朝北斗七星的方向一直驶去。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("大雨中随着马儿奔跑，两边的林子逐渐变的稀疏了。几分钟后，两人总算驶出了林子。根据月亮的位置，现在大约已经到了亥时，其他队友仍然不见踪影。葛申到路边摘了几个野果勉强充饥，把马儿牵到一处洞口，两人今晚在洞里休息了。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("葛申刚要把野果喂给妻子吃，想到会加剧妻子的尿意，增加其痛苦感。除了野果外再没其他好吃的，只好先自己吃了。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("葛申狼吞虎咽的吃着野果，嘴里发出噶几噶几的咀嚼声。突然耳边响起一个微弱的声音“给我吃几个。。。。”原来是身边的妻子恳求道。“不行，这种果子水分多，你吃了会加剧尿意。咱还不知啥时能找到达摩祖师，给你治好伤势。你再吃的话，膀胱会很难受的。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“没关系，我饿的受不住了，这种感觉比憋尿更痛苦。憋几天无所谓，我可以忍住。我的好丈夫，听我的，我的身体自己有数。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("为了不让妻子继续遭罪，葛申拿出裤兜里的小刀，把果子切成片，往妻子嘴里送。不一会，秋琴就吃完了三个，说：“可以了。”葛申这才停下。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("外面的雨仍在下着，葛申已经疲劳到了极点，不知不觉搂着妻子打起了呼噜。旁边的马儿还是比较通灵的，看到主人睡着了，也跪下把身子侧在一边休息了。");
					sb.append("</div>");
					sb.append("<div class=\"next_chap_nav_div\">");
						sb.append("夫妻俩接下来的命运如何？真的能找到那位达摩祖师吗？请看下回分解。");
					sb.append("</div>");
					sb.append("<div>");
						sb.append("(1)指印度，世界四大文明古国之一。");
					sb.append("</div>");
					sb.append("<div>");
						sb.append("(2)传说中各种妖魔鬼怪的总称。");
					sb.append("</div>");
					sb.append("<div>");
						sb.append("(3)古代的长度单位，一舍等于三十里。");
					sb.append("</div>");
					sb.append("<div>");
						sb.append("(4)磷化氢燃烧时的火焰。磷与水或碱作用时产生磷化氢和少量的五氧化二磷，是无色可以自燃的气体。人和动物的尸体腐烂时分解出的磷化氢，并自燃。夜间野外有时看到的白色带蓝绿色的火焰就是磷火。");
					sb.append("</div>");
					sb.append("<div>");
						sb.append("(5)指没羽箭张清，《水浒传》里的人物，擅长使用石头当作武器射击。");
					sb.append("</div>");
					sb.append("<div>");
						sb.append("(6)原名瑶姬，西王母第二十三个女儿。下凡治水时暗恋上了杨天佑并结婚生子，遭到了天庭的惩罚。死后化作神女峰，坐落于重庆巫山。");
					sb.append("</div>");
					sb.append("<div>");
						sb.append("(7)出自秦观的《鹊桥仙·纤云弄巧》。");
					sb.append("</div>");
					sb.append("<div>");
						sb.append("(8)出自陆游的《游山西村》。");
					sb.append("</div>");
				sb.append("</div>");
			sb.append("</div>");
		sb.append("</div>");
		
		return sb.toString();
	}

	/**
	 * 获得第8章内容
	 * @return
	 */
	public static String getChapter8() {
		
		StringBuilder sb=new StringBuilder();
		sb.append("<div class=\"main_div\">");
			sb.append("<div class=\"chapter_div\">");
				sb.append("<h1 class=\"title_div\">");
					sb.append(CHAP8_TIT_NAME);
				sb.append("</h1>");
				sb.append("<div class=\"content_div\">");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("下了一整夜的雨，地上的泥土湿润润的。天还没亮，太阳才刚刚与地平线相切，在池塘里躲了一整夜的青蛙开始出来觅食，蜻蜓也在距离地面不到一米处飞来飞去。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("百姓与土匪们经历了昨晚的战斗，在黑枫林深处留下许多马蹄印和脚印，向着不同方向分散。有一条脚印线朝西北方的黑风寨处延伸，另一条则向着北方延伸。先说正北方向这条，延伸进了距离黑枫林最北端几百米的一处山洞里。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("山洞最里面躺着两人，浑身湿漉漉的。女子下身臀部缠着纱布包裹的严严实实的，依偎在男子怀里。旁边的马儿正吃着男子昨晚吃剩的几个野果，野果上还缠着几条地龙(1)，马儿连同果子带地龙一起吃了下去。一条地龙反应比较灵活，看到马儿要吃果子了，便离开了果子表面，顺着爬到了男子脸颊上。这时，旁边出现了一只青蛙。还没等地龙反应过来，就被青蛙吞进了嘴里。青蛙这一吞，把男子惊醒了。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("经过一夜的休憩，葛申的体力已恢复八九成，只是感觉有些饥饿感。一活动胳膊，感觉肩胛骨旁略微有些疼痛感。解开貂皮大衣一看，原来是昨晚被没羽箭射中时留下的淤青，还好不是特别严重，不影响行动。妻子还在熟睡，臀部包裹着厚厚的纱布。到目前为止，妻子还是遵守大夫的叮嘱，没流出过一滴尿液。秋琴的毅力还是蛮鉴定的，到现在为止已经憋了将近一天。除了昨日上午与土匪们厮杀前喝了水、昨晚吃了几个野果外，期间没喝过一碗水。事不宜迟，葛申轻轻的把妻子抬上马背，牵着马儿走出山洞。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("雨已经停了一段时间，雨过天晴后外面已是阳光明媚、晴空万里，一道道彩虹挂在半空。现在只有葛申和秋琴俩，李吉、小七和其他队友都不知去向。反正都知道要去积米崖，他们应该会通过打听方式自己找过去，秋琴还在憋着呢，事不宜迟，也没更多时间等待了。离开红尘客栈走了两舍路来到了黑松林，现在已出了黑松林走了一段路，距离积米崖应该还有不到半舍远了。前面又出现一座集市，葛申感觉除去找到达摩祖师不知会面临什么麻烦外，在见到达摩祖师前的这段路上不会有麻烦了。秋琴在这时正好醒了，两人便找了家餐馆饱餐了一顿。老板告诉他们，在前面十里路的地方，有座巍峨的山峰，应该就是他们要找的积米崖，但山上是否有白云观倒不是很清楚。吃完后交了盘缠，葛申就立即骑上马儿上路了。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("葛申骑着马儿又走了半响，已出了集市。前面是一座小桥，远远看去，有位牧童骑着黄牛朝小桥这边走来。马儿跟黄牛之间的距离越来越近，黄牛在距离马儿一丈远处停下了，牧童看上去不到十岁的样子。看到马背上的女子臀部裹着绷带，问：“大叔这是要去哪里？”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“孩子，请问如何去积米崖？”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“顺着这条道往前走不久，会看见一座山峰就是。大叔去那里干嘛？”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“去白云观找一位达摩祖师，他医术高明，求他给我妻子疗伤。孩子可曾听说过？”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“不仅听过还见过，他就是我的师傅，我叫白鹤童子。不过师傅让我每天在山下放牛，吩咐过不许带任何人上山，想见他必须过天人三问才行。大叔有能力过的话可以试试，不然请按原路回去吧。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“既然我们费劲千辛万苦经过黑枫林来到这里，不见到达摩祖师就没打算回去。孩子刚才说的天人三问是什么？”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“古人云‘天人合一’，三才者乃天地人也。仁者乐山、智者乐水，能将自己与宇宙万物合二为一乃智者也。先过第一关：天关。听好问题：千里草、何青青，十日卜、不得生。答一历史人物。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("葛申对这类猜谜游戏不太擅长，中华上下五千年，上至炎黄、下至民国，历史人物成千上万不可胜数，这可难矣。又回想刚才白鹤说的那间断的十二个字，问：“神话人物也算吗？”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“就那十二个字，多的不提。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("葛申想到女娲造人前，世间都是天地玄黄、宇宙洪荒的镜像，千里都是寸草。女娲用了七日创造了世间万物，最后一日才创造了人。七比十小，不到十日没有生命。便胸有成竹的回答：“女娲！”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("白鹤摇摇头道：“加油继续猜，猜不出来的话请按原路返回。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("葛申想到妻子已经憋一天多了，现在已接近巳时，不知妻子还能坚持多久。又想到这个人物肯定与草有牵连，不到十天创造了某项成就。又想到三国时期诸葛亮草船借箭的故事，可草船离着曹营不到一千里，而且诸葛亮只用了三天就“借”来了十万只箭。想问童子这个人物是什么朝代的，知道童子肯定不会告诉他。管他对不对，只要脱口而出就有一线希望，哪怕有万分之一的概率答对也得尝试。便又回答：“诸葛亮！”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("童子还是重复着刚才的动作，不过这次总算回复了一句话“第二个回答离谜底已经很近了。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“很近是什么意思？是跟诸葛亮有啥关系？还是朝代离着三国时期很近？”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("童子只是呆呆的看着葛申，却没回答一个字。葛申听到刚才童子的那句很近的话，几秒之内感到充满着希望，现在又感觉失落了几分。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“是董。。。卓。。。。吗？”旁边一个含糊微弱的声音回答。原来这声音是秋琴发出来的，在半梦半醒之间含糊的说完了这几个字。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“恭喜恭喜！天人三问第一关算通过了！”童子口齿清晰的说着“千里草合起来就是董字，何青青是对董卓当年的罪恶做了批判。十日卜合起来是卓字，是有人占卜他活不过十天了。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("这个看似简单，又看似复杂的问题居然被重伤的女子答对了。不过对于葛申来说算是喜事，至少闯过了这一关。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“不要高兴的太早，后面两关比这一关要难，能不能过关就要看你们的运气了。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("白鹤童子放葛申上了山，随着地势的升高，下面的白鹤童子渐渐缩成了一个小点，最后消失不见了。葛申骑着马儿驮着秋琴继续往山上前行，他们位于半山腰间，云层离他们越来越近。俯瞰下面的景物，有种会当凌绝顶，一览众山小(2)的感觉。第二关又是什么样的关卡？正当葛申寻思着时，从山上的小路走下一位童子来，年龄看上去和刚才那位童子差不太多。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“欢迎来到天人三问的第二关问地，我是清风，是达摩祖师的弟子。这一关的问题说难也难、说容易也容易，所谓会者不难难者不会。你们准备好了吗？”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“好了！”葛申胸有成竹的回答。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“从1到5这五个数字，只能出现一次，不管用什么运算符号，让结果等于22，如何摆放？”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("葛申听了清风童子的这一问题，感觉比上一道容易，便从路边捡来几块鹅卵石，从口袋里掏出画笔，在白色鹅卵石上写上一到五这几个数字和加减乘除这几个运算符，开始拼凑。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("1乘以2加3等于5,4乘以5等于20，这样前后加起来却成了25，不对。1加2等于3、再减去3等于0、再加上4乘以5又等于20了，更不对。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("时间一分一秒的过去，太阳已经升到了正上方，此时正是午时三刻。葛申已经拼凑了将近半个时辰，仍然未拼出一个合理的等式。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("正当葛申一筹莫展时，马儿从草丛里嚼来一把草走到他旁边。葛申说：“我心爱的马儿，你一定是饿了吧？不好意思，我不吃草的，你先自己吃吧。”说着摸了摸马儿的脑袋。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("但马儿并没有吃草的意思，而是用嘴把一节节草根连接成一道半月牙似的东西，又把另一把草用同样的动作连接成一道半月牙似的东西，这两个图形成轴对称图案。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“我心爱的马儿，你想跟我玩什么游戏？我现在在解谜题，没时间陪你啊。”葛申说。可马儿不会说人话，而是走到写着“1”字样的鹅卵石旁，用马蹄把石头一点点踢到两个半月牙似的图案之间，带有“1”字的鹅卵石靠在左边的半月牙图案右边。葛申有点通晓马儿的意图了，是在帮他解谜题。难道马儿的智商真的比人还高？");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("马儿又从葛申摆的石堆里找到带有“+”字样的石头，同样用马蹄一点点的移到“1”字石头的右边。现在出现了“(1+)”图案，但“+”号与右边的小括号之间还留着一个空隙。马儿又把带有“3”字的石头移到“+”和“)”之间，这样就成了“(1+3)”字样。紧接其后，马儿又把“÷”号移到“)”右边，形成了“(1+3)÷”。又把“2”移到了“÷”右边，连起来是“(1+3)÷2”。剩下的数字只有4和5了，还有“×”和“-”，一共四块鹅卵石。马儿把“4”、“×”、“-”从左到右拼接在一起，放在“(1+3)÷2”右边，中间还留着一个空隙。但就剩下最后一个写着“-”的石头了，2-20=18啊，也不是22.但出乎意料的是，马儿并没有继续移动最后一块带有“-”的石头，而是用几节草根在空隙里拼接出来“+”号。这样“(1+3)÷2+4×5”字样就出来了，结果正好等于22。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("马儿朝清风童子叫了三声，原来童子一直盯着那些鹅卵石感觉太无聊了，正在观赏半空中的鸿鹄。被马儿这么一叫，立刻回过神来，看到了已拼接好的式子，脸上露出了满意的笑容说：“恭喜过关，大叔真了不起。以前有几位高僧曾闯过天人三问，最多到这关就走不下去了，大叔真是史无前例。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("原来马儿趁清风走神时来协助主人解题，而清风误认为是大叔自己答出来的。就算葛申对童子说了实话，童子也绝对不会相信这匹普普通通的马儿会有这种智商。葛申这才悟到，原来不仅可以用加减乘除符号，也可以用括号。而且虽然规定每个数字只能用一次，每种符号并没规定必须只能用一次。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“不过。。。”清风突然开口说：“最后一关是问人，人虽然生于天地间，但人关却是三关里最难的一关，而且有时间限制，只有一次机会，到时打不出来就算失败，只能原路返回了。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“时间是多久？”葛申问清风：");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“天机不可泄露，大叔若准备好了想继续挑战的话，就顺着山路继续往上走吧，到时自会知晓。清风只能祝大叔好运了。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("前两关虽然题目比较难，但没有时间限制。只要秋琴能憋的住，自然有时间。只是自己虽然身强力壮，但对于答题这块却不擅长。第一关是秋琴帮忙答的、第二关是通人性的马儿帮忙“答”的、第三关是否能顺利通关呢？这是见达摩祖师的最关键的一关。管它呢，只要有万分之一的希望就要敢于尝试，不尝试希望就是零。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("葛申站在清风旁边呆滞住了，旁边却传来一个微弱的声音“走吧。。。还有我呢。。。”葛申拜别清风，向着山顶继续出发。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("有话曰：“蜀道难，难于上青天。”下面的山地早就不见了，从山上望下去已是茫茫云海，自己就像漫步云端，上面还有很长一段路要走，至少目前还望不到头。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("葛申拉着马儿驮着妻子已经走了大半晌，午时已过。他们从今早吃了点外，到现在还没吃东西，听见自己的肚子咕咕叫。葛申顾不上这些，只顾闯关，这第三关也是最后一关，是决定能否见到达摩祖师的关键，决不能半途而废。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("葛申边走边想：“第一关题目是与历史有关、第二关是与数学有关、第三关的题目能与啥有关？假如侥幸通过了，真的能见到那位达摩祖师吗？他的医术真的有那么高明？假如答题失败就得按原路返回，好容易来到这里，就得花费很长时间牵着马儿驮着妻子走下山。那样妻子最后只有一个结果，既然妻子不能活下去了，自己活着还有啥意思？不如连马带人一起从山上跳下去一走了之得了。对了，还有小花需要自己照顾，自己陪妻子殉情，小花岂不是成了孤儿。这马儿都能答题，说明是匹好马。世有伯乐、然后有千里马，千里马常有，而伯乐不常有(3)。难道自己就是那位伯乐？关二爷被杀后，他的赤兔马选择了绝食而亡；刘皇叔的的卢能带着他跳过大江。自己有这么匹良马，还没来得及报答它，自己不能就因失败先去。天无绝人之路，就算见不到达摩祖师，说不定还有其他法子。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("葛申边走边想，想着想着，马儿叫了几声，葛申回过神来。原来前面约好几百米的地方出现了山顶，一位童子站在那里，手里拿着一个沙漏，相必是用来计时的。葛申感觉心跳加速了，但为了能发挥最好的答题思维，只能遏制住情绪。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("不一会，人和马都走到了童子面前。童子说：“欢迎大叔来到天人三问的最后一关‘问人’，我是达摩祖师的弟子明月。这是计时器，要是大叔能在里面的沙粒全部漏到下面之前答出题目，我就带你们去见达摩祖师，准备好了吗？”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("葛申深吸一口气说：“好了。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("童子并没有立刻开始计时，而是说道：“从1加2加3。。。一直加到1000等于多少？计时开始！”说完把手里的沙漏一翻转，原本在下面装满沙粒的的那层移到了上面、上面空着的那层移到了下面，上面的沙粒正快速的往下面漏，形态好比流水。沙粒比较稀，虽然漏口很小，但感觉流速比流水还快好几倍。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("沙粒已经流失大约十分之一了，葛申顾不上观察沙漏的变化，把精力转移到答题上。1加2等于3、再加3等于6、再加4等于10、再加5等于15.。。。再抬头看沙粒已经减少三分之一了，才加到5，要加到1000才行。不行，这种计算速度就算十个沙漏都不够用，得想办法计算更快。但手中没有文房四宝(4)，就算有写字也消耗时间，还不如口算快呢。又抬头看到沙漏里的沙粒已减少三分之二了，看来已经没戏了，只能另选其他法子。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("没等沙粒都漏完，葛申刚想开口说放弃，旁边一个声音说：“等于。。五。。零。。零。。。五。。。零。。。零。。。。”最后一个零字刚说完，上层沙漏里的最后一粒沙粒便漏了下去。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“恭喜！回答正确！”旁边的明月祝贺道：");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("葛申真不敢相信自己的耳朵，三道题目，妻子答对了两道。至于怎么答对的先不管，假如达摩祖师真的能医治好妻子的伤势，等妻子康复后再问不迟。反正不管三七二十一，所有的关卡已经通关了，马上就能见到达摩祖师了，目前越早治好妻子的伤越好。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("明月带着夫妻俩和马儿继续往前走，前面不再是往上走的阶梯了，取而代之的是比较平坦的路面，也是遍地着很多鹅卵石。走了一会，葛申看见走在前面的明月童子踩到了路面上一块颜色不同的石头，眼前的景象变了，由平坦的山路变成了天桥。他们正处在桥中间，而且桥下是茫茫云海，不知有多深，桥前面居然还断了一截，大约好几百米的距离。虽然断了一截，但桥却没有塌陷。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“孩子，请问我们怎么来到了这里？白云观在哪？”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("明月却微笑着指了指桥下，说：“白云观就在这下面最底端，因为处于茫茫云海最底下而得名，师傅就在里面。这里因为是断桥，叫做断桥驿。虽然大叔过了天人三问，但必须从这里下去才能见到师傅。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“从这里下去啊？那还能活吗？有没有其他路可以下去？”葛申迷惑不解。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“只能从这里下去，这是去白云观的必经之路，要是大叔不愿意，可以按原路返回。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("葛申正在犹豫，旁边那个熟悉的声音又说：“上马。。。驮着你和我。。。下去吧。。。听我的。。我是你妻子。。。不会害你。。。为了咱。。。为了小花。。。。快点下去吧。。。。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("既然妻子都这么说了，葛申只好听从别无他法。便跨上马儿，确保妻子已经稳了，喊：“驾！”马儿好像听懂了刚才的对话，知晓了主人的意图，以风驰电掣之速疾冲向断桥。到了断桥处，马蹄一蹬瞬间跳了起来，动作气势不逊当年刘皇叔的的卢跨江。跳出好几十米远，呈抛物线状平着马背下落。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("夫妻俩在马背上坐的稳稳的，葛申不知明月童子为了让他们从这里跳下，接下来真的会见到达摩祖师呢，还是会见到死神？带着满腹疑问，感觉断桥在上方越来越远，最后消失不见。周围被一团团白云萦绕住，随着重力加速度快速下落，整个身体好像意识被掏空。周围氤氲起来，看不清妻子的样子，在这种感觉中失去了知觉。");
					sb.append("</div>");
					sb.append("<div class=\"next_chap_nav_div\">");
						sb.append("明月为何让夫妻俩跳下去？夫妻俩接下来会怎样？请看下回分解。");
					sb.append("</div>");
					sb.append("<div>");
						sb.append("(1)指蚯蚓。");
					sb.append("</div>");
					sb.append("<div>");
						sb.append("(2)出自唐代诗人杜甫的《望岳》。");
					sb.append("</div>");
					sb.append("<div>");
						sb.append("(3)出自唐代诗人韩愈的《马说》。");
					sb.append("</div>");
					sb.append("<div>");
						sb.append("(4)指笔、墨、纸、砚。");
					sb.append("</div>");
				sb.append("</div>");
			sb.append("</div>");
		sb.append("</div>");
		
		return sb.toString();
	}

	/**
	 * 获得第9章内容
	 * @return
	 */
	public static String getChapter9() {
		
		StringBuilder sb=new StringBuilder();
		sb.append("<div class=\"main_div\">");
			sb.append("<div class=\"chapter_div\">");
				sb.append("<h1 class=\"title_div\">");
					sb.append(CHAP9_TIT_NAME);
				sb.append("</h1>");
				sb.append("<div class=\"content_div\">");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("清晨入古寺，初日照高林(1)。这句话经常用来形容早上寺院早上在阳光下的景象。白云观坐落于积米崖最顶端，如同一座寺院，屹立在海拔好几千米的高山上。按物理学常识，海拔每升高一千米，气温就下降六度。身体素质一般的来到这种环境，极容易发生高原反应。但积米崖最顶端却与众不同，来到上面感觉和在平原上行走一般，反而觉得呼吸更顺畅。物华天宝、人杰地灵，正有一种尝似人间仙境的感觉。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("读到这里，聪明的读者也许有疑问：“明月童子在上一章里不是说过，白云观位于悬崖最底端，被淹没在茫茫云海里吗？怎么跑到悬崖最上端了？”是的，明月是这么说的，其实那座独木桥是机关制造的虚幻罢了，算是一个关卡。准确来说，应该是天人四问才对。除了天、地、人关外，还有粮关，合起来就叫“天、地、粮、人”。这座山之所以叫“积米崖”，是因为米也属于五谷杂粮。粮的读音和良是谐音，只有心地善良的智者才有资格见到达摩祖师。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("葛申的双眼紧闭着等待死神的来临，上一秒还感觉自己在快速下落，风飕飕的顺着耳边刮过。约摸着自己快要落到谷底了，很难想象死亡的那一瞬间会是什么感觉，五脏六腑都被震碎的感觉究竟有多痛苦？");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("时间好像过了好久，葛申感觉耳边的飕飕声消失了，有种如沐春风的感觉。“大叔睁开眼吧！”葛申听到了明月的话，缓缓的睁开了眼睛。眼前的景象并非是断桥驿，而是来到了禅院里。院子里依然是三人和一匹马，只是葛申经历了刚刚的考验，好像做了一场梦，不清楚自己是怎么进来的这里。葛申恢复意识后，童子便给他解释了刚才所发生的一切其实都是由心而生，考验个人的心智。葛申已通过考验，有见祖师的资格了。禅院里的景象如同《红楼梦》里的大观园一般，方圆好几百米。里面有假山、果树、池塘，池塘里除了荷花、田田的荷叶，还有很多条五颜六色的鱼儿随波游荡，这小鱼儿有些连童子也叫不上名来。它们见有人来了，把嘴儿贴在水面上，好像在说欢迎之类的话。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("禅院的最头上有一座高墙，上面写着斗大的“佛”字。童子带着他们绕过了佛字墙，出现在眼前的是一条条长廊，如同北京的颐和园(2)。长廊两旁的柱子是暗红色的，上面非常光滑，长廊拐来拐去，好像永远走不到尽头似的。可能是年幼的原因，明月行走的速度比葛申当过兵的走的还快。葛申便加快了脚步，想尽快见到祖师。妻子已经憋尿好几天了，平日里饮水最少时平均每日至少也得去个三四次，这是有生以来头一次憋这么久。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("说快也快，他们终于走到了长廊的尽头，是一间祖祠堂，牌匾上写着“白云观”三个大字。有位道人站在外面守门，告诉童子现在可能不太方便，祖师正在里头给学弟们讲经。明月点点头，让葛叔一会等祖师讲完时，只许带着叔母入内，不要带着马儿入堂，祖师历来爱干净。葛叔点点头，把马儿暂时引到长廊的一根柱子旁，用牵绳将其拴在上面，又到窗口处透进去观看里面的情景。那位所谓的达摩祖师的打扮看上去和僧人似的，光头穿着僧衣，坐在椅子上。手里没有拿任何书本，只是用手势比划着动作。离他几米出按等差数列(3)阵势坐着十来位弟子，他们都盘膝坐在地上，看上去听的津津有味。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“佛教是世界三大宗教(4)之一，起源于古印度。印度也被称为四大文明古国(5)之一，中国也是其一，之所以被这样称作，因其资源丰富。印度有印度河、中国有长江、黄河，长江中下游地区，人类文明的发源地。。。”讲到这里祖师突然停住了，朝窗外看了看，看到了葛申的脸庞。葛申也看到了祖师正在看他，感觉自己无意中打扰祖师讲课了，不知怎么的好。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“今天的课先讲到这里”课才上了十来分钟，祖师就宣布下课。“金刚！”祖师点名。“在！”站在门口的道人进了祠堂。“传外面那位来客进来。”“是！”葛申听到祖师的话，就从马背上背起妻子进去了。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“请坐！”祖师从椅子上站起身，很客气的让葛申坐下，“把这位女子放在弟子的垫子上就行。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“弟子怎敢坐祖师的位子。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“没关系，你们的事我已经知道了，救人要紧。咱既然都见面了，不分辈分。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“祖师已经。。。知道了？”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“是的，我看了那封信才知道你很需要我的帮助。”说着，祖师从腰里拿出大夫写的那封信，葛申摸了摸自己的腰包，那封信不知啥时到了祖师手里。祖师告诉说，是刚才在第二关答题时，清风趁他不注意看到腰包里露出了信封，便拿了出来偷着拆开看了看，知道要找我，就放鸽子(6)送到了我这里。清风失礼了，现在正在闭门思过中。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“算了吧，孩子还小出于好奇，他这是帮我提前通知祖师了，我不但不怪他，反而要谢谢他呢。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“难得还有人有这般胸襟。”祖师便传金刚通知清风加冕了。祖师又说：“这位女子的伤势看来比较重，我得单独找个地方看看才行，这里可能不太方便，牵上马儿，跟我来。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("葛申又背起妻子，将其放回马背上，牵着马跟随祖师的脚步往后山走去。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("祖祠堂已经是山上最高处了，出了祠堂往后山走的路开始从高往低延伸。走了大约十来分钟，有座石门出现在眼前，上面用艺术字刻着“白云洞”三个大字。祖师说：“这里正是我闭关修行的地方，不要说是一般人，就连我的弟子我都不允许入内，今我就破例一次好了。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("祖师嘴里念念有词说了些什么，石门好像也通灵，祖师念完后才一秒，门就自动打开了，两人进去了。洞里没有任何点燃的蜡烛，却充满明光，看上去跟白天似的，原来这些光都是从一个碗口那么大的水晶球上散发出来的。祖师又念了句，旁边一处密室突然间打开了。里面放着很多山珍海味，都是葛申在村里最爱吃的，看上去放了很久，却没发霉。祖师让葛申不要受拘束，可以随便拿块尝尝。葛申拿起一卷素鸡尝了口，还是保持着最初的新鲜感。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("祖师又念了一句什么，秋琴从马背上飘了起来，缓缓的落在一座石床上。“不介意的话我可以看看女子的伤口吗？”“可以，有劳祖师了。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("这里除了马秋琴外，只有葛申和祖师。祖师亲手脱掉秋琴的裤子，解开她臀部的绷带，拨开她的双腿看了半分钟左右。说：“阴部已无形、子宫内部受伤严重。这种伤势就算医术再高明的大夫也很难治愈，不过我可以用道法给她制作一套模拟的器官。但中间过程比较繁杂，不得有任何人来打扰。这套器官包括尿道、子宫在内，需要灵符来维持。需要两样东西：泥土、爱人的血液。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("泥土需要比较粘稠的那种水泥状，洞外就有。血液只能用葛申自己的，因为他是秋琴的丈夫。葛申出了洞府，挖了一斗放在研钵里，祖师看了说里面沙粒比较多，不太合适。葛申想起禅院的鱼塘边可能会有合适的水泥，便又从后山回到禅院里挖了些感觉合适的。祖师说不是全部合适，挖了一部分。因分量不够，葛申又一次跑到禅院里挖，总共来回三次才凑齐分量。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("接下来该用血液研磨水泥了，祖师让葛申先吃饱肚子睡上一觉，只有体力、精力旺盛时的血液混合到水泥里才能充满灵性。葛申从那晚和妻子一起睡在山洞里到现在一直没合过眼，这一睡就是三个时辰。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("醒来后,祖师问准备好没，葛申点头。祖师说：“放心，只用100毫升左右就够了，要是感觉不舒服就说。”说完拿出小刀在葛申手腕处轻轻划了一道三厘米长度的口子，一道殷红的血液便流了出来。不一会祖师觉得够了分量，便点了葛申的穴道，血液便不再往外流了。祖师拿出纱布包扎好葛申的伤口，从腰间拿出一副黄色乳胶手套戴上，便开始作法了。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("祖师嘴里念念有词道：“七情六欲人皆有之，泥人也有三分火性。自盘古开天辟地，女娲娘娘用泥巴造人，人类从此便有了生生不息的生命。有生就有死，生生死死轮回变化无常。女娲娘娘知道这一自然界法则，说不定自己以后也会赤裸裸的离去。于是便给了泥人男女性别，男女交配繁衍后代，荫泽万物。”念着念着，手里一块泥土捏成了阴部形状，黄色的乳胶手套也被泥土沾变了色。作法正进行着，突然，一股红色液体从祖师鼻孔里流了出来。葛申看到后刚要上去擦拭，祖师摇摇头表示拒绝。并没有拿当回事，继续作法。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("祖师又从研钵里抓出一把泥土，继续念道：“女者子宫，先天之本，给予肉身、给予生命。。。”这时，红色液体已经流到了祖师衣服上，祖师并不在意，保证作法顺利进行，不能打断。不多时，泥土又被捏成了子宫形状。祖师拨开秋琴双腿，解开纱布，露出血肉模糊的部位。祖师在秋琴身体上点了穴位，说是马上要开刀把成形的泥土塞进去才能成肉身，点穴是为了防止痛疼。祖师又拿刚才割葛申手腕的小刀，在秋琴阴部开了道口子，先是把子宫状泥土沾了研钵里的血液，塞了进去，又把阴道状的泥土沾了血液糊在了阴部位置。从衣服里拿出一道白色的，类似卫生巾状的仙符，贴在了阴部位置，就像女子来身上时用来保护差不多。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("祖师喃喃的说：“施法基本上完成了。”给秋琴提上裤子，把腰带系好。“一会她就醒了，到时候穴道自然就会解开。她憋好几天了，醒来后会想小解。别让她下床，先让她尿盆子里。让她在这里静养三日，三日后便可下床行走，不能做剧烈运动。待七日后方可出洞，和正常人一样行动。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“谢祖师！”葛申说着热泪盈眶，跪在祖师面前磕头。祖师将其搀扶起来，这时嘴里猛地吐出一口鲜血。葛申忙给祖师擦拭着，将其扶到旁边的椅子上。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“我没啥大碍，只不过是刚才运功过久，元气有所损耗，休息一会就没事了。还有，那张和卫生巾似的仙符里面有我注入的灵气，用来保护泥土状器官的稳固，足够维持住她后半生，让她和来身上一样戴着它。虽然她没事了，但这次作法消耗了她差不多二十年的阳寿。她来身上也不要紧，仙符自会吸收进去转为灵气。切记不能让她过性生活，否则仙符的灵气就会失效。每日小解不得超过两次，否则会破坏仙符上的灵气，虽然不会失效，但会减少仙符的寿命。切记！”祖师把这些箴言写在纸上递到葛申手中，自己踉踉跄跄的走到平日里打坐的地方，运上气闭上了双眼开始调理。葛申见祖师在运功疗伤，没打扰祖师，而是陪在妻子身边，将手搭在其胳膊上。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("过了大约一个多时辰，秋琴的手微微开始动弹，葛申感觉到了。秋琴嘴里发出微弱的声音：“憋。。憋。。。尿尿。。。”丈夫端来尿盆，解开纱布和白色仙符，说：“尿吧！”秋琴憋好几天没尿了，一股橘黄色的液体如同喷泉里的水，从刚治愈的阴部涌了出来，撒到了尿盆里。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("尿了大约有五分钟依然还在撒，尿盆快要满了，葛申不得已只好拿水杯接住尿液，快速跑到卫生间倒掉盆里的尿液，继续接。又过了两三分钟，妻子的尿液才渐渐的放缓，半分钟后停下了，尿盆里又有了一半尿液。倒掉后葛申给妻子擦拭干净，贴上仙符、包好纱布、提上裤子系上腰带。看到妻子轻松多了，自己也就放心了。接下来就是守护在妻子身边，度过这七天的疗伤期。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("秋琴的精神头起色一日好起一日，第二天起一直保持清醒状态，葛申告诉她祖师的叮嘱，她都照做了。祖师经过一晚上的运气调理血脉，次日也好些了。因为还要给弟子们讲课，便把夫妻俩留在了白云洞里。正如祖师所说，秋琴最近来事了，但戴着仙符，效果和卫生巾一样，把流出来的液体都吸收进去了。秋琴感觉戴着仙符的感觉比以前垫着卫生巾舒服多了，以前垫卫生巾时下面还有点感觉，现在垫着仙符下面跟没来事的时候一样，没什么感觉。每日小便的次数基本都能控制在1-2次左右，早上一次、晚上一次。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("夫妻俩在床边聊起往事，记得两人第一次见面时，葛申刚睁开眼看见的第一个人就是秋琴的脸庞，从眼神上就能感觉出来，秋琴是多么淳朴的一位好姑娘。秋琴喜欢游泳，因为自己是女孩子，不方便脱光下水，就穿着衣服下水了，经常因弄湿衣服被父母说了一顿。葛申当过兵，水性不亚于秋琴。记得有次两人在水里比赛谁游得快，秋琴远远落在了葛申后头，葛申老远听见秋琴大喊：“亲爱的过来帮帮忙，有个东西钻到了我裤裆里！”葛申又游回来，那时虽然两人还未结婚，葛申见秋琴不介意，就把手伸进她内裤里。摸到了一条黏糊糊的东西，拿出来一瞧，原来是一条大鲶鱼，还把卫生巾也带了出来，上面沾着红色东西。葛申不知秋琴来事了，就一手抓着鲶鱼，另一只手拉着她上了岸。鲶鱼大约有十来斤重，两人吃不了，就带回村里做了道油泼鲶鱼，把村民们叫来自家聚餐吃了。村民们吃的正嗨，谁都不知道，这鲶鱼在秋琴的内裤里待过，还比一般的鱼味道更浑厚。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("第四天开始，秋琴能自理了，尝试着下床走动，不用葛申搀扶都可以。祖师每日讲完课都要来洞里看看他们俩，起色一天好起一天。夫妻两都是勤快人，把洞里的边边角角打扫的一尘不染。秋琴说自己又变回原来那位有血有肉的女人了，感觉身体好多了，除了要控制小便的次数，下面多了道仙符外，其他没啥异常感觉。控制小便次数倒不是什么难事，稍微多喝些水也无所谓，只是心里牵挂着一件事。葛申说：“我也牵挂着那件事，我数到三咱俩一起说，看看是不是想到了一块去。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("“一。。。二。。。三”“小花！”两人异口同声的说出口，说完两人紧紧的拥抱在一起。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
						sb.append("这时，洞门打开了，祖师走了进来，看到了两人依然保持着拥抱的动作，感觉脸色变红了，把头转向一边，说：“抱歉，我什么都没看到。”看到两人并不介意，继续说：“刚才清风童子上山告诉我说山下有人找葛申。”");
					sb.append("</div>");
					sb.append("<div class=\"next_chap_nav_div\">");
						sb.append("清风说的这位找葛申的是何许人也？请看下回分解。");
					sb.append("</div>");
					sb.append("<div>");
						sb.append("(1)出自常建的《题破山寺后禅院》");
					sb.append("</div>");
					sb.append("<div>");
						sb.append("(2)即故宫");
					sb.append("</div>");
					sb.append("<div>");
						sb.append("(3)指从第二项起，每一项与它的前一项的差等于同一个常数的一种数列。");
					sb.append("</div>");
					sb.append("<div>");
						sb.append("(4)即佛教、基督教、伊斯兰教。");
					sb.append("</div>");
					sb.append("<div>");
						sb.append("(5)即中国、印度、埃及、巴比伦。");
					sb.append("</div>");
					sb.append("<div>");
						sb.append("(6)不遵守诺言。");
					sb.append("</div>");
				sb.append("</div>");
			sb.append("</div>");
		sb.append("</div>");
		
		return sb.toString();
	}

	/**
	 * 获得第10章内容
	 * @return
	 */
	public static String getChapter10() {
		
		StringBuilder sb=new StringBuilder();
		sb.append("<div class=\"main_div\">");
			sb.append("<div class=\"chapter_div\">");
				sb.append("<h1 class=\"title_div\">");
					sb.append(CHAP10_TIT_NAME);
				sb.append("</h1>");
				sb.append("<div class=\"content_div\">");
					sb.append("<div class=\"paragraph_div\">");
					sb.append("“找我？”葛申诧异的问祖师。“是的，找你。听清风说来者名叫‘小七’。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
					sb.append("葛申听后喜出望外，毕竟和队友走散好几天了，听到这喜讯真是吉人自有天相。妻子的伤情基本康复，马上又要见到队友了，葛申有种说不出的喜悦。秋琴也要出去迎见他们，葛申却让她在洞里调养，等会会带着小七来见她的。祖师听到葛申说认识小七，便传让清风传令让小七上山来。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
					sb.append("葛申和祖师出了白云洞，走了一会便来到了禅院。本以为见到小七后会有种久别重逢的喜悦，但这种喜悦被眼前的一幕吞没了。眼前的小七差点令葛申认不出来，脸上带着好几条伤痕、衣服破破烂烂、走起路来踉踉跄跄的。而且只有他自己，其他弟兄并不在身边。原来清风怕葛叔担心，故意不把小七受伤的事告诉他。葛叔理解清风的做法，况且清风是祖师门下的弟子，祖师也理解。两人搀扶着小七回白云洞修养，顺便询问这几天来的遭遇。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
					sb.append("小七跟随着葛队和祖师来到了白云洞，真不敢相信这种类似人间仙境的地方居然真的存在。以前听过类似的神仙之地，像蓬莱仙岛、瑶池等传说中的地方，渴望在有生之年去游玩一番，今天终于如愿以偿。不过当下任务不是放在游玩上，而是告诉葛队这几天自己和弟兄们的遭遇。葛申夫妻俩和祖师听小七娓娓道来的讲述开了。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
					sb.append("那晚自葛申夫妻俩跟其他弟兄们走散后，其他几个弟兄光顾着跟土匪们拼杀，干掉几个土匪，其余的处于下风，不敢恋战就边打边撤。他们对这里的路比较熟悉，不会迷路，而葛队里的弟兄们却迷了路，不管怎么绕来绕去，却都迂回到了原路。有几个比较有头脑的没有继续追赶土匪，小二、小五都跟着小七走。李吉、泼皮等却继续追赶土匪，追着追着迷了路，想回去却找不到路了。只能一步步往前走，走着走着却又回到了原地。他们感到累了，再走也是消耗体力，便暂时停下来休息一会再说。正当他们躺下没多久，一张渔网从天而降，将李吉、泼皮等人一起网了起来。原来他们的行踪早被土匪盯上了，趁他们不备便用这招将其擒住。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
					sb.append("“将这几个人统统带回山寨交给大王处置。”“遵命！”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
					sb.append("小七等人绕着绕着，绕道了一处山角下。那里有户人家冒着炊烟，便进去化斋。里面住着一对老妇和老翁，待人倒是挺热情。通过聊天才知道，那帮土匪来自西北方的一座叫黑风寨的地方。他们的女儿小兰春就是十年前生日那晚被土匪绑走的，如今是死是活还不清楚。那帮土匪只是一群不起眼的喽啰而已，但他们有三个土匪头目，一个叫“黑袍”、一个叫“巨蝎子”、一个因为会飞檐走壁，叫“飞天蜈蚣”。他们三人合称“黑风老妖”，是从十年前才出现的，便在这里的西北方成立了黑风寨的地方，对树林施了法，不管怎么走都是迂回。不过老妇、老翁倒是知道怎么个走法能走出去，只是要先给小七等人讲讲这三个土匪头目的来历。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
					sb.append("传说在一千年前他们就存在，都是妖精，黑袍是条蟒蛇、巨蝎是条蝎子、飞天蜈蚣是一条蜈蚣，他们成精后就幻化成了人形，无恶不作，经常绑架妇女儿童。自从他们的出现，这片树林就变成了迷林，不知施了什么法老是迂回。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
					sb.append("苍天有眼，有次打雷下雨，一条闪电化作葫芦山，变成了一个硕大的葫芦。这时他们三正在聚会，吃孩子的心肝。葫芦看来也通灵，把他们三收了进去，镇压起来了。正因苍天显灵，被他们抓起来的妇女儿童获救了。他们三在葫芦山里镇压着并没有死，只是一直关押在黑暗里。葫芦山分三层，一人一层被封印着，浑身无法动弹，意识还在，但无法说话，过着生不如死的日子，只要满一千年就彻底灰飞烟灭。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
					sb.append("九百九十九年过去了，周围的生灵都过的很安宁。就在第一千年初，这里发生了地震，方圆好几百里范围都地动山摇。那座葫芦山也被震塌了，失去了封印能力。三个妖精趁此机会逃了出来，他们终于见到了光明。巨蝎是女妖、蜈蚣是男妖，他们出来后不管黑袍在身边，便脱下裤子来开始小解。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
					sb.append("“不要脸！”黑袍嘲笑道：");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
					sb.append("“大王别介意，我真的快要憋死了。一千年前我就想小解了，没等来就被收进了葫芦里。在里面可能是被法力控制住了，想尿也尿不出来。每天忍受着这么强烈的憋尿滋味，憋了将近一千年啊，我真的受够了。我虽然是妖精，但好歹也是位有血有肉的女人啊。”说着巨蝎下面还在排尿，把下面对准黑袍脸上尿了他一脸。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
					sb.append("“就是憋的你轻了，应该关你个一万年，让你多尝尝憋尿的滋味。”黑袍把脸上的尿液用袖子擦拭干净，“我身为一条雄蛇，被收前喝的酒量比你和蜈蚣加起来都多，被关了一千年都没有尿意。你和蜈蚣就喝了那点马尿，就他妈的憋不住了？孙猴子当年被如来压在五行山下五百年都没尿过尿。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
					sb.append("“无可厚非，你是蟒蛇出身，我是蝎子精、他是蜈蚣，我们的憋尿能力当然没有你强。换位思考，假如我是蛇、你是蝎子或蜈蚣，你远不如我呢。”说到这里，巨蝎才刚尿完，裤子里还垫着卫生巾，上面沾了很多红色液体，将近一千年没换了。便扔掉卫生巾，提上裤子系好腰带。卫生巾刚好落在黑袍的脚边，黑袍一脚踢开它，刚飞起来正好被风吹到了旁边的小溪里。溪水本来很清澈，这下被染红了。刚才巨蝎的尿液也流到了溪水里，呈橘黄色。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
					sb.append("“真不要脸！卫生巾扔了还不知道换新的就提上了裤子，要是再来一次就流到了裤子里洗不掉了。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
					sb.append("“还早呢，前几天被困洞里时刚来的，下次来还得半个多月呢，身上现在没有多余的卫生巾，等回去后准备些备用。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
					sb.append("“雌性真难伺候！”蜈蚣说，“还是雄性好，只有大姨夫(1)而已，顶多裤衩上沾点黄色粘液，几天后就干了，一洗就洗去了。”蜈蚣也是刚尿完，裤衩上沾了不少黄色东西，早就干了。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
					sb.append("“蜈蚣虽然随地大小便，但没有巨蝎这么难伺候。”黑袍讥讽道，“一千年的黄金(2)虽然积累的多点，也比巨蝎的红宝石(3)值钱。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
					sb.append("“我呸！”巨蝎一口唾沫吐在黑袍脸上，“还说别人不要脸，你更不要脸，重男轻女的孬种。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
					sb.append("虽然黑袍把蜈蚣说的价值比巨蝎好点，但蜈蚣赖得听黑袍的片面之词。脱掉红色裤衩，光着屁股跑到溪边轻轻的搓了搓，一千年积攒的黄色东西不一会都脱落了，等晾干后可以继续穿了。又在溪边洗了洗阴茎和屁股，连裤子都没提就走到巨蝎身边，指着下面说：“一千年没洗澡了，洗洗真爽，你不妨也洗洗吧？”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
					sb.append("刚才巨蝎被黑袍讽刺了一顿，火气还未消，又被蜈蚣这般侮辱，顿时所有火气都转移到蜈蚣身上。瞬间变成了蝎子，用尾部的毒针一甩扎在蜈蚣的阴茎上，痛的蜈蚣嗷嗷大叫，阴茎瞬间肿的屁股般大，连裤子都提不上了。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
					sb.append("“哎吆吆，救救我、救命啊。。。”蜈蚣捂着阴茎在地上翻来覆去的呻吟，由于身体不住的动弹，毒液顺着血管开始蔓延，臀部也开始肿大了。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
					sb.append("“快给蜈蚣解毒！”黑袍大声呵斥巨蝎，“要是蜈蚣因你而死，我绝不会放过你的。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
					sb.append("“你跟蜈蚣什么关系啊？这样央求我。除非让蜈蚣跪下来求我，从我胯下爬过，要不免谈。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
					sb.append("“我替他做可以吗？”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
					sb.append("“你不要脸的话就做吧，我就不信你真的能做到。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
					sb.append("黑袍果然跪下身从巨蝎胯下爬过，这时巨蝎突然放了个屁，咯咯地笑个不停，眼都闭了起来。正当她幸灾乐祸时，突然发出嗷嗷的惨叫声。原来黑袍趁她不注意，找准时机在她裤裆里钻了个洞，钻进了她屁眼里，又从其屁眼里钻进了她肚子里。巨蝎发出撕心裂肺的嚎叫，叫声淹没了蜈蚣的惨叫，听上去比蜈蚣还凄惨。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
					sb.append("“黑袍大王，求求你饶了我吧，我马上救蜈蚣还不行吗？”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
					sb.append("“先救了他再说！快点，别磨叽。”黑袍在巨蝎的肚子里发出声音命令。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
					sb.append("巨蝎解开腰带，再次脱下裤子来。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
					sb.append("“你在干嘛？脱裤子干嘛？”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
					sb.append("“解毒需要用尾后针，得变回蝎子形态才行。你在我肚子里我无法施法变回去，只好脱裤子来解毒。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
					sb.append("“快点吧，要是敢耍花招，看我不钻破你的五脏六腑。”蜈蚣浑身上下大半已经变成了暗黑色，在地上翻来覆去锤死挣扎。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
					sb.append("“不敢！”说着，巨蝎把尾后针再次插进蜈蚣的阴茎处，这次射出来的不是上次的黑色毒液，而是一股蓝色液体。不一会，蜈蚣身上暗黑色区域开始消退，变成了肉黄色。挣扎声开始减小，意识慢慢的清醒过来。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
					sb.append("“解毒了，大王可以出来了吗？”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
					sb.append("“急啥，还没到时候！”虽然巨蝎给蜈蚣解毒了，但肚里大王的声音变的比以前更为狰狞。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
					sb.append("“还要我做啥？”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
					sb.append("“背着蜈蚣回洞府。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
					sb.append("“遵命！”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
					sb.append("巨蝎不得已听了黑袍大王的吩咐，背上躺在地上还没起来的蜈蚣精，感觉蜈蚣至少有自己两倍重，缓慢的往洞府方向走。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
					sb.append("走了大约有半个时辰，终于到了洞府前。上面有块陈年的石碑刻着“黑风洞”三个大字，经历了一千年之久，已经出现了好多条裂痕，弥漫着蛛网。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
					sb.append("“口令是什么来着？”巨蝎记不得了，问肚子里的黑袍大王。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
					sb.append("“芝麻开门，健忘虫，什么记性！”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
					sb.append("巨蝎喊了口令，洞门在几秒后果然打开了。刚开了一道缝，里面有成百上千的蝙蝠飞了出来。蜈蚣精在巨蝎背上，巨蝎首当其冲的被蝙蝠抓伤了脸庞。有几只蝙蝠还落在巨蝎身上，被巨蝎抖擞着挣脱开了。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
					sb.append("进洞后，里面很多边边角角都布满蛛网，还有很多蝙蝠尸体和粪便。黑袍虽然在巨蝎的肚子里，好像也能看到外面的场景。对巨蝎命令：“找个干净点的地方，把蜈蚣放在上面休息，把洞里打扫干净。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
					sb.append("“这里有一千年没人住，没有干净的地方。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
					sb.append("“不会自己打扫吗？”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
					sb.append("巨蝎被迫背着蜈蚣精到洞外几里外的树林里掰了几根树枝，编成扫把。又回到洞里，捂着鼻孔，先找了块地打扫完，把蜈蚣放在上面。又挨个角落把蝙蝠的尸体和粪便都清理了，洞里面积方圆好几百米，打扫了将近一个时辰。");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
					sb.append("“就这就行了？打扰的干净些，一尘不染的程度。”");
					sb.append("</div>");
					sb.append("<div class=\"paragraph_div\">");
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
					sb.append("");
					sb.append("");
					sb.append("");
					sb.append("");


巨蝎按照黑袍的吩咐，又打扫了一个时辰，手心手背上都磨起了水泡。黑袍这才满意，也没打声招呼，“唰”的一声从巨蝎的肛门里钻了出来。巨蝎有那么几分钟感觉撕心裂肺，像是肠子被拽出来似的。
</div>
<div class="paragraph_div">
“我的兄弟，让你受苦了，现在没事了吧？”黑袍关心蜈蚣精。
</div>
<div class="paragraph_div">
“没事了，行了，别再刁难巨蝎姐了，她已经够受了。”
</div>
<div class="paragraph_div">
“刚才她把你害成那样，不必可怜她。”
</div>
<div class="paragraph_div">
虽然黑袍从巨蝎的体内出来了，但巨蝎心里却生恨，心想：“重生的第一天就被你们这般折磨，咱们骑驴看唱本，总有一天我会报复你们的！”
</div>
<div class="paragraph_div">
往后的日子里，黑袍还是偏向蜈蚣精，对巨蝎视而不见。巨蝎一直想办法对付他们，却一直想不出来。为了避免受委屈，巨蝎经常起早天黑的到洞外游荡。
</div>
<div class="paragraph_div">
一晚，巨蝎刚准备回洞，却闻到了一股香气，有种呕吐的感觉。顺着香气的方向去找，看到一座茅屋里摆着关二爷的神像，旁边插着三柱香。里面还有唱歌声“Harry birthday to my baby.....”巨蝎透过窗口看到里面除了一对夫妻外，还有一位五六岁左右的小千金，桌子上摆放着几道佳肴、一个宝葫芦、一个生日蛋糕，原来是一家三口在庆贺女儿的生日。
</div>
<div class="paragraph_div">
“祝小兰春生日快乐！”夫妻俩一口同声的祝福道，“闭上眼睛许个愿吧。”
</div>
<div class="paragraph_div">
兰春闭上双眼嘴里念念有词，憋足气吹灭了蛋糕上的五根蜡烛。突然间屋里的灯也跟着灭了，看不清任何东西。“啪”一声响，窗口被石头之类的硬物砸碎了，窗外传来一声狰狞的笑声。兰春的父亲老杨拿起木棍跑到了屋外大喊：“哪位强人？报上名来！”杨嫂怕丈夫有闪失，也跟着出来了。屋外除了地上有破碎的玻璃碴子外，没人任何人，连个影子都没看到。屋里还是漆黑一片，却没了声音。夫妻俩感觉哪里不太对劲，突然间意识到了什么，大喊：“杨兰春！”屋里却没有任何回应，原来中了强人的调虎离山计。强人先打破窗户玻璃，又扔石头打碎了灯泡，引蛇出洞。利用声东击西之计趁夫妻俩出来时，从窗户爬了进去，掳走了女儿兰春。趁夫妻俩没反应过来，从门口逃走了。
</div>
<div class="paragraph_div">
夫妻俩反应过来为时已晚，换上新灯泡开了灯。屋里桌子翻了，满地都是蛋糕碎渣和饭菜，唯独女儿和她的生日礼物宝葫芦不见了。杨嫂由于一时吃惊过度晕了过去，任丈夫怎么呼唤都不省人事。
</div>
<div class="next_chap_nav_div">
杨兰春接下来的命运会怎样？夫妻俩能否救回被掳的女儿？请看下回分解。
</div>
<div>
(1)指男子来遗精。
</div>
<div>
(2)指粪便。
</div>
<div>
(3)指月经。
</div>
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
