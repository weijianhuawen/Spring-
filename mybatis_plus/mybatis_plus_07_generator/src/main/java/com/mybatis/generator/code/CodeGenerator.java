package com.mybatis.generator.code;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.mybatis.generator.Test;
import com.sun.org.apache.bcel.internal.classfile.Code;
import org.apache.ibatis.javassist.compiler.CodeGen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class CodeGenerator {
    public static void main(String[] args) {
        //1.新建代码生成器对象
        AutoGenerator generator = new AutoGenerator();

        //2.配置数据源，此时就可以运行了
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
        dataSourceConfig.setUrl("jdbc:mysql://localhost:3306/mybatis_case?useSSL=false&severTimezone=GMT%2B8");
        dataSourceConfig.setUsername("root");
        dataSourceConfig.setPassword("123456");
        generator.setDataSource(dataSourceConfig);


        //3.配置全局配置
        GlobalConfig globalConfig = new GlobalConfig();
        //设置保存模板的路径
        globalConfig.setOutputDir(System.getProperty("user.dir") + "/mybatis_plus_07_generator/src/main/java");
        //设置作者
        globalConfig.setAuthor("未见花闻");
        //设置生成完成后是否自动打开
        globalConfig.setOpen(false);
        //是否覆盖原来生成的文件
        globalConfig.setFileOverride(true);
        //设置数据层接口名 %s为占位符 表示生成模块的名称
        globalConfig.setMapperName("%sDao");
        //设置id生成策略
        globalConfig.setIdType(IdType.ASSIGN_ID);
        //配置完此步骤得到的代码在com.baomidou下
        generator.setGlobalConfig(globalConfig);

        //4.设置包名相关配置
        PackageConfig packageConfig = new PackageConfig();
        //设置生成代码的包名
//        packageConfig.setParent("com.auto");
        packageConfig.setParent("com.opt");
        //设置实体类包名
        packageConfig.setEntity("mode");
        //设置数据层包名
        packageConfig.setMapper("dao");
        //配置完此步骤生成的代码在com.auto包下
        generator.setPackageInfo(packageConfig);

        //5.策略设置
        StrategyConfig strategyConfig = new StrategyConfig();
        //设置参与生成的表名
        strategyConfig.setInclude("opt_user");
        //设置数据库表明的前缀，前缀不参与组名
        strategyConfig.setTablePrefix("opt_");
        //设置是否启用restful风格
        strategyConfig.setRestControllerStyle(true);
        //设置乐观锁字段名
        strategyConfig.setVersionFieldName("version");
        //设置逻辑删除字段名
        strategyConfig.setLogicDeleteFieldName("deleted");
        //是否启用lombok
        strategyConfig.setEntityLombokModel(true);
        //配置完此步骤生成的代码在com.opt包下
        generator.setStrategy(strategyConfig);

        //启动代码生成器
        generator.execute();

    }
}
