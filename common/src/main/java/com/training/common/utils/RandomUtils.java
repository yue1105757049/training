package com.training.common.utils;

import java.util.Random;

/**
 * @User: wong
 * @Date: 2020/10/10
 * @Description: 随机有关工具类
 */
public class RandomUtils {


  // 生成一个范围为 min - max 的随机整数
  public static int getRandomNum(int min, int max) {
    Random random = new Random();
    return random.nextInt(max) % (max - min + 1) + min;
  }


  // 随机获取姓名
  public static String getName() {
    Random random = new Random();
    // 百家姓
    String[] lastName = {"赵", "钱", "孙", "李", "周", "吴", "郑", "王", "冯", "陈", "褚", "卫", "蒋", "沈", "韩", "杨", "朱", "秦", "尤", "许",
        "何", "吕", "施", "张", "孔", "曹", "严", "华", "金", "魏", "陶", "姜", "戚", "谢", "邹", "喻", "柏", "水", "窦", "章", "云", "苏", "潘", "葛", "奚", "范", "彭", "郎",
        "鲁", "韦", "昌", "马", "苗", "凤", "花", "方", "俞", "任", "袁", "柳", "酆", "鲍", "史", "唐", "费", "廉", "岑", "薛", "雷", "贺", "倪", "汤", "滕", "殷",
        "罗", "毕", "郝", "邬", "安", "常", "乐", "于", "时", "傅", "皮", "卞", "齐", "康", "伍", "余", "元", "卜", "顾", "孟", "平", "黄", "和",
        "穆", "萧", "尹", "姚", "邵", "湛", "汪", "祁", "毛", "禹", "狄", "米", "贝", "明", "臧", "计", "伏", "成", "戴", "谈", "宋", "茅", "庞", "熊", "纪", "舒",
        "屈", "项", "祝", "董", "梁", "杜", "阮", "蓝", "闵", "席", "季"};
    String girl = "秀娟英华慧巧美娜静淑惠珠翠雅芝玉萍红娥玲芬芳燕彩春菊兰凤洁梅琳素云莲真环雪荣爱妹霞香月莺媛艳瑞凡佳嘉琼勤珍贞莉桂娣叶璧璐娅琦晶妍茜秋珊莎锦黛青倩婷姣婉娴瑾颖露瑶怡婵雁蓓纨仪荷丹蓉眉君琴蕊薇菁梦岚苑婕馨瑗琰韵融园艺咏卿聪澜纯毓悦昭冰爽琬茗羽希宁欣飘育滢馥筠柔竹霭凝晓欢霄枫芸菲寒伊亚宜可姬舒影荔枝思丽 ";
    String boy = "伟刚勇毅俊峰强军平保东文辉力明永健世广志义兴良海山仁波宁贵福生龙元全国胜学祥才发武新利清飞彬富顺信子杰涛昌成康星光天达安岩中茂进林有坚和彪博诚先敬震振壮会思群豪心邦承乐绍功松善厚庆磊民友裕河哲江超浩亮政谦亨奇固之轮翰朗伯宏言若鸣朋斌梁栋维启克伦翔旭鹏泽晨辰士以建家致树炎德行时泰盛雄琛钧冠策腾楠榕风航弘";
    //获得一个随机的姓氏
    int index = random.nextInt(lastName.length - 1);
    String name = lastName[index];
    //可以根据这个随机数设置产生的男女比例 0,1,2 这里男女比例 2：1
    int i = random.nextInt(3);
    if (i == 2) {
      int j = random.nextInt(girl.length() - 2);
      if (j % 2 == 0) {
        name = name + girl.substring(j, j + 2);
      } else {
        name = name + girl.substring(j, j + 1);
      }
    } else {
      int j = random.nextInt(girl.length() - 2);
      if (j % 2 == 0) {
        name = name + boy.substring(j, j + 2);
      } else {
        name = name + boy.substring(j, j + 1);
      }

    }
    return name;
  }


}
