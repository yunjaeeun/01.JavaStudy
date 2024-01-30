package aggregate;

import java.io.Serializable;
import java.lang.reflect.Member;

public class Board implements Serializable {
    private int boardNo;        // 게시글 번호
    private String id;          // 작성자
    private String content;     // 작성내용
    private String date;        // 작성날짜
    private String title;       // 글 제목
    private CategoryType categoryType; // 카테고리


    public Board() {
    }

    public Board(int boardNo, String id, String content, String date, String title, CategoryType categoryType) {
        this.boardNo = boardNo;
        this.id = id;
        this.content = content;
        this.date = date;
        this.title = title;
        this.categoryType = categoryType;
    }

    public int getBoardNo() {
        return boardNo;
    }

    @Override
    public String toString() {
        return "Board{" +
                "boardNo=" + boardNo +
                ", id='" + id + '\'' +
                ", content='" + content + '\'' +
                ", date='" + date + '\'' +
                ", title='" + title + '\'' +
                ", categoryType=" + categoryType +
                '}';
    }
}