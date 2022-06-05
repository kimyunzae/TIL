# Git . Github



## 버전관리는 크게 세가지

- 백업: git add, git commit, git push
- 복구: git reset
- 협업: git clone, git pull, git branch, git merge -> PR

> CLI (Command Line Interface) = GUI (Graphic User Interface)
> Git Bash에서 ~는 HOME과 같은 뜻
> CLI 폴더의 "절대경로"는 C:\Users\i7-4770\CLI (./)
> CLI 폴더의 "상대경로"는 C:\Users\i7-4770  (../)



## 두 방식의 버전관리

1. snap shot (버전들과 변경사항 하나씩 모두 저장)
2. delta (최종버전 하나와 변경사항 여러개 저장)

## Git Bash 명령어

- `cd`: change directory
- `touch a.txt`: a.txt파일 만듬
- `rm a.txt`:  a.txt파일을 지움
- `mkdir CLI`: CLI라는 파일을 만듬
- `ls`: list segments (목록들)
- `ctrl + l`: 깔끔하게
- `ls -a`: 숨긴 파일 등등 모두 보여줌 (all)
- `rm -r CLI`: CLI폴더 삭제(recursive) 



## Git 사전지식

### CLI

### VS code
ctrl + `: 터미널

### Markdown



## Git ) push, clone, pull  

1. Working Directory (분장실)
2. Staging Area (준비)
3. Commits (버전 저장)

### first commit

```git
git config --global user.name kimhyunzae
git config --global user.email bill7751@naver.com
git config --global --list
git init
git status
git add a.txt
git commit -m "first commit"
git log
```

### second commit

```git
git add a.txt
git status
git commit -m "first commit"
git log --oneline
```

### 현재 디렉토리 안의 모든 파일들을 add

```git
git add .
```

### 원격저장소에 올리기
1. 로컬과 원격을 연결
2. 로컬의 버전을 원격에 보내기

```git
git remote add origin https://github.com/kimhyunzae/Today-I-learned.git
git remote -v 
git push origin master
```

### 수정후
```git
git add .
git commit -m "Upload day01.md"
git push origin master



### 주의사항

1. **git init 중첩 x**
2. **상위폴더 git init x**
3. **github에서 수정 x**



### .gitignore

git ignore를 사용하면 버전을 무시할 수 있다.

```git
.gitignore 파일 생성 후, ignore하고싶은 파일 넣기
```



### 원격 저장소에서 파일 가져오는법

1. **clone**: 다운로드

```햣
git clone https://github.com/kimhyunzae/git-practice.git
```

2. **pull**: 업데이트

```git
git pull origin master
```

3. 버전이 다르면 충돌(conflict)이 생기니 둘이 합친다.

**원격에서 받고 수정 후 보내기**

```git 
git clone https://github.com/kimhyunzae/word-relay.git //다운로드
git pull origin master
수정, ctrl + s
git add .
git commit -m "~~"
git push origin master
```



## Git )  branch

**로그를 그래프로 보여주기**

```git
git log --oneline --graph --all
```

**브랜치 만들기**

```git
git branch feature
```

**브랜치 목록 조회**

```git
git branch
```

**다른 평행우주로 이동**

```git
git switch feature
```

**브랜치 삭제**

```git
git branch -D feature
```

**브랜치 병합**

```git
git switch master
git merge feature
```

>master에서 feature를 merge

**master를 되돌리기**

```git
git reset --hard a8e036e3(해시번호)
```

### merge

1. Fast-forward (앞버전으로 맞춤)
2. Auto-merging (자동)
3. Conflict (수동)

### Pull Request

`fork`→`clone`→브랜치 생성→ `add` → `commit` → 브랜치 `push` → `pull&request` 보내기

