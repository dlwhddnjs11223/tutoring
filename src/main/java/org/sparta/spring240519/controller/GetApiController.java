//package org.sparta.spring240519.controller;
//
//
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Map;
//
//@RestController
//@RequestMapping("/api/get")
//public class GetApiController {
//    @RequestMapping(path = "/hi", method = RequestMethod.GET)
//    public String hi(){
//        return "hi";
//    }
//
//    @GetMapping(path="/hello")
//        public String hello(){
//        return "get hello";
//        }
//
//      //  http://localhost:9090/api/get/path-variable/{name}
//        // 변수를 받아줘야 할때는 중괄호 안에 변수를 넣고 @Pathvariable로 받아준다.
//    @GetMapping("/path-variable/{name}")
//        public String pathVariable(@PathVariable String name){
//            System.out.println("PathVariable : "+ name);
//            return name;
//        }
//
//        // 파라미터 이름이 GetMapping 내의 이름과 다를 떄는 따로 명시해준다.
//    @GetMapping("/path-variable2/{id}")
//    public String pathVariable2(@PathVariable(name="id") String pathName){
//        System.out.println("PathVariable : "+ pathName);
//        return pathName;
//
//
//    }
//
//    // http://localhost:9090/api/get/query-param?user=steve&email=gmail.com&age=30
//    // Query Parameter 받아온 후 Map으로 키와 밸류값을 받아서 돌면서 출력
//    // @RequestParam 첫번째 방법
//    @GetMapping("/query-param")
//    public String qeuryParam(@RequestParam Map<String, String> queryParam){
//        StringBuilder sb = new StringBuilder();
//        queryParam.entrySet().forEach(entry->{
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//            System.out.println("\n");
//            sb.append(entry.getKey()+"="+entry.getValue()+"\n");
//        });
//        System.out.println(sb);
//        return sb.toString();
//
//    }
//
//    // 더 명시적으로 하기 위해서 파라미터 형식을 미리 입력받음
//    @GetMapping("/query-param2")
//    public String qeuryParam2(@RequestParam String user, @RequestParam String email, @RequestParam int age){
//        System.out.println(user);
//        System.out.println(email);
//        System.out.println(age);
//        return user +  " " + email + " " + age;
//    }
//
//    // DTO를 생성해서 객체를 넘겨주는 방법, 자동으로 주소값을 Springboot에서 매치 시킴
//    // 현업에서 가장 많이 사용함, 나중에 검증 활용할 때도 좋다.
//    // @RequestParam 세번째 방법
//    // 숙제
//    //w 질문 , 자동으로 주소값을 Springboot에서 매치시킨다고 했는데, DTO를 생성해놓고 파라미터에 DTO를 집어넣으면 알아서
//    @GetMapping("/query-param3")
//    public String queryParam3(UserRequest userRequest){ //※ @RequestParam 앞에 붙이니까 에러나네요. 왜이러죠?
//
//               return userRequest.toString();
//    }
//
//}
