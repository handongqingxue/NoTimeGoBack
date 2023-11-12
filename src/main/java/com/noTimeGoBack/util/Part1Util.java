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
	public static final String CHAP6_TIT_NAME="第6章 父子情";
	
	public static final String CHAP1_IMAGE_PATH=Contant.IMAGE_PATH+"001";
	public static final String CHAP2_IMAGE_PATH=Contant.IMAGE_PATH+"002";
	public static final String CHAP5_IMAGE_PATH=Contant.IMAGE_PATH+"005";
	
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
						sb.append("“妹子放心，一共两个包是不是？都完好无损，只是被雨水浸湿了，在墙角的暖炉边烘干呢。”大山指了指墙角那边，志华看到除了两包行李外，还有自己的一字带鞋和袜子都放在那里烘干着，这才踏实。墙角除了自己的鞋袜外，还烘着一双vans一脚蹬黑色帆布鞋(1)，鞋底是黄色花纹样式的，和一双白色棉袜。低头看到大山哥脚上穿着拖鞋和白色棉袜，袜筒上带着nike商标(2)。");
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
