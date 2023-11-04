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
	public static final String CHAP4_TIT_NAME="第4章 龙师长";
	
	public static final String CHAP1_IMAGE_PATH=Contant.IMAGE_PATH+"001";
	public static final String CHAP2_IMAGE_PATH=Contant.IMAGE_PATH+"002";
	
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
						sb.append("烈日炎炎的夏天，农民们在一幕幕方田里星罗棋布，面朝黄土地背朝天的农耕。有位少女约摸二十岁左右，头戴蓑笠帽、身穿衬衫、短裤、脚穿沙滩凉鞋和白色尼龙袜(<a href=\""+CHAP1_IMAGE_PATH+"001.jpg\" target=\"_blank\">图</a>)，在收老玉米。边收边念念有词的哼唱着《在希望的田野上》(1)，手推车里一颗颗金黄色的玉米渐渐堆成小山。");
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
					sb.append("");
				
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
